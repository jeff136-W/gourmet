package com.it.gourmet.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.it.gourmet.entity.News;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NewsDao extends BaseMapper<News> {
	
}
