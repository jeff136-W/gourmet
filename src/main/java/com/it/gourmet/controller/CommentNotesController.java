package com.it.gourmet.controller;

import com.it.gourmet.service.CommentNotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/commentnotes")
public class CommentNotesController {
    @Autowired
    private CommentNotesService commentNotesService;


}
