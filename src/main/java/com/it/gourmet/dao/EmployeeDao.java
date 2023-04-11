package com.it.gourmet.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.it.gourmet.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeDao extends BaseMapper<Employee> {
}
