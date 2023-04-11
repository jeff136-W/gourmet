package com.it.gourmet.controller;

import com.it.gourmet.service.PraiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/praise")
public class PraiseController {
    @Autowired
    private PraiseService praiseService;


}
