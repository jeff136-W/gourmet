package com.it.gourmet.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.it.gourmet.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {
	
}
