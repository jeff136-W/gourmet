package com.it.gourmet.controller;

import com.it.gourmet.service.FoodsMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foodsmaterial")
public class FoodsMaterialController {
    @Autowired
    private FoodsMaterialService foodsMaterialService;


}
