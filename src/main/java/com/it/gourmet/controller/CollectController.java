package com.it.gourmet.controller;

import com.it.gourmet.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/collect")
public class CollectController {
    @Autowired
    private CollectService collectService;


}