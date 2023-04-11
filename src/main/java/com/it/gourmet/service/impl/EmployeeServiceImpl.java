package com.it.gourmet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.it.gourmet.dao.EmployeeDao;
import com.it.gourmet.entity.Employee;
import com.it.gourmet.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service("employeeService")
public class EmployeeServiceImpl extends ServiceImpl<EmployeeDao, Employee> implements EmployeeService {
}
