package com.it.gourmet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.it.gourmet.dao.FoodsMaterialDao;
import com.it.gourmet.entity.FoodsMaterial;
import com.it.gourmet.service.FoodsMaterialService;
import org.springframework.stereotype.Service;

@Service("foodsMaterialService")
public class FoodsMaterialServiceImpl extends ServiceImpl<FoodsMaterialDao, FoodsMaterial> implements FoodsMaterialService {

}