package com.it.gourmet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.it.gourmet.dao.NewsDao;
import com.it.gourmet.entity.News;
import com.it.gourmet.service.NewsService;
import org.springframework.stereotype.Service;

@Service("newsService")
public class NewsServiceImpl extends ServiceImpl<NewsDao, News> implements NewsService {

}