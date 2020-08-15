package com.aaa.controller;

import com.aaa.dao.PorductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    PorductService porductService;

    @RequestMapping("test")
    public String test(){
        return porductService.a();
    }
}
