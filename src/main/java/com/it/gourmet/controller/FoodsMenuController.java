package com.it.gourmet.controller;

import com.it.gourmet.service.FoodsMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foodsmenu")
public class FoodsMenuController {
    @Autowired
    private FoodsMenuService foodsMenuService;

}
