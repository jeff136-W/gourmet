package com.it.gourmet.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.it.gourmet.dao.ClassifyDao;
import com.it.gourmet.entity.Classify;
import com.it.gourmet.service.ClassifyService;
import org.springframework.stereotype.Service;

@Service
public class ClassifyServiceImpl extends ServiceImpl<ClassifyDao, Classify> implements ClassifyService {

}