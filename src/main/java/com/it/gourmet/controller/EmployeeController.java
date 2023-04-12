package com.it.gourmet.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.it.gourmet.common.Result;
import com.it.gourmet.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;
import com.it.gourmet.entity.Employee;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@Slf4j
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/login")  //发送的请求json 格式的数据，接收需要@Requesbody注解
    public Result login(HttpServletRequest request , @RequestBody Employee employee) {
        //1. md加密密码
        String password = employee.getPassword();
        password = DigestUtils.md5DigestAsHex(password.getBytes());

        //2. 用户名查询数据库
        LambdaQueryWrapper<Employee> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Employee::getUsername,employee.getUsername());
        Employee emp = employeeService.getOne(queryWrapper);

        //3. 如果没查到返回登录失败
        if (emp == null){
            return Result.error("登录失败");
        }

        //4. 密码对比，不一致返回登录失败
        if ( !emp.getPassword().equals(password)) {
            return Result.error("登录失败");
        }

        //5  员工状态查看，禁用则返回已禁用
        if (emp.getStatus() == 0){
            return Result.error("账号已禁用");
        }

        //6.    登录成功 ，id存入session并返回成功
        request.getSession().setAttribute("employee",emp.getEmployeeId());
        return Result.success(emp);
    }

    @PostMapping("/logout")
    public Result<String> logout(HttpServletRequest request){
        //清理Session中保存的当前登录员工的id
        request.getSession().removeAttribute("employee");
        return Result.success("退出成功");
    }

    @PostMapping("/add")
    public Result save(HttpServletRequest request , @RequestBody Employee employee){
        log.info("新增员工 ， 员工信息: {}", employee.toString());
        //        设置初始密码123456，但需要进行md5加密处理
        employee.setPassword(DigestUtils.md5DigestAsHex("123456".getBytes()));
        employee.setCreateTime(LocalDateTime.now());
        //获得当前登录用户ID
        Long empId = (Long) request.getSession().getAttribute("employee");

        employee.setCreateBy(empId);

        employeeService.save(employee);

        return Result.success("新增员工成功");
    }

    @GetMapping("/page")
    public Result<Page> page(int page , int pageSize, String name ){
        log.info("page = {} , pageSize = {} p, name = {} ", page , pageSize, name);

        //构造分页构造器
        Page pageInfo = new Page(page, pageSize);
        //如果name传进来了，构造条件构造器
        LambdaQueryWrapper<Employee> queryWrapper = new LambdaQueryWrapper();
        //添加过滤条件
        queryWrapper.like(StringUtils.isNotEmpty(name),Employee::getName,name);
        //添加排序条件
        queryWrapper.orderByDesc(Employee::getUpdateTime);
        //执行查询
        employeeService.page(pageInfo,queryWrapper);

        return Result.success(pageInfo);
    }

    @PutMapping("/update")
    public Result update(HttpServletRequest request, @RequestBody Employee employee){
        log.info(employee.toString());

        long id = Thread.currentThread().getId();
        log.info("线程id为： {} " , id);
        Long empId = (Long) request.getSession().getAttribute("employee");
        employee.setUpdateTime(LocalDateTime.now());
        employee.setUpdateBy(empId);
        employeeService.updateById(employee);

        return Result.success("员工信息修改成功");
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Long id){
        log.info("根据id查询员工信息...");
        Employee byId = employeeService.getById(id);
        if(byId != null) {
            return Result.success(byId);
        }
        return Result.error("查询失败...");
    }

}
