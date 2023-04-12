package com.it.gourmet.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.it.gourmet.common.Result;
import com.it.gourmet.dao.EmployeeDao;
import com.it.gourmet.entity.Employee;
import com.it.gourmet.service.EmployeeService;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.servlet.http.HttpServletRequest;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeDao, Employee> implements EmployeeService {

}
