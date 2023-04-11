package com.it.gourmet.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.it.gourmet.dao.UserDao;
import com.it.gourmet.entity.User;
import com.it.gourmet.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

}