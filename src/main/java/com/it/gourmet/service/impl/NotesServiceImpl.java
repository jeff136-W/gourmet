package com.it.gourmet.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.it.gourmet.dao.NotesDao;
import com.it.gourmet.entity.Notes;
import com.it.gourmet.service.NotesService;
import org.springframework.stereotype.Service;

@Service("notesService")
public class NotesServiceImpl extends ServiceImpl<NotesDao, Notes> implements NotesService {

}