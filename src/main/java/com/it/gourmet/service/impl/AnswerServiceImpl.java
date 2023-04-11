package com.it.gourmet.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.it.gourmet.dao.AnswerDao;
import com.it.gourmet.entity.Answer;
import com.it.gourmet.service.AnswerService;
import org.springframework.stereotype.Service;

@Service("answerService")
public class AnswerServiceImpl extends ServiceImpl<AnswerDao, Answer> implements AnswerService {

}