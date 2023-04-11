package com.it.gourmet.controller;

import com.it.gourmet.service.AdvertiserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/advertiser")
public class AdvertiserController {
    @Autowired
    private AdvertiserService advertiserService;


}
