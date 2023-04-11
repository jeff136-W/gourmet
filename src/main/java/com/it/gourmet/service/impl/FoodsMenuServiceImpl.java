package com.it.gourmet.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.it.gourmet.dao.FoodsMenuDao;
import com.it.gourmet.entity.FoodsMenu;
import com.it.gourmet.service.FoodsMenuService;
import org.springframework.stereotype.Service;

@Service("foodsMenuService")
public class FoodsMenuServiceImpl extends ServiceImpl<FoodsMenuDao, FoodsMenu> implements FoodsMenuService {


}