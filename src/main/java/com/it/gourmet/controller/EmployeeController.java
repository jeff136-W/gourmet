package com.it.gourmet.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.it.gourmet.common.Result;
import com.it.gourmet.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.it.gourmet.entity.Employee;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * 员工登录
     * @param request
     * @param employee
     * @return
     */
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
}
