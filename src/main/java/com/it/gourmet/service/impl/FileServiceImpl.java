package com.it.gourmet.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.it.gourmet.dao.FileDao;
import com.it.gourmet.entity.File;
import com.it.gourmet.service.FileService;
import org.springframework.stereotype.Service;

@Service
public class FileServiceImpl extends ServiceImpl<FileDao, File> implements FileService {

}