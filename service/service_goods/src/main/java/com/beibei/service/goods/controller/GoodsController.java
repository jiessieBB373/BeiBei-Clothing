package com.beibei.service.goods.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/goods")
@RestController
public class GoodsController {


    @GetMapping("/test")
    public String test(){
        return "hello word";
    }
}
