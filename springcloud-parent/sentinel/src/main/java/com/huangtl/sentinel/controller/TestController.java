package com.huangtl.sentinel.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author huangtl
 * @Date 2020/11/9 17:25
 **/
@RestController
@RequestMapping("")
public class TestController {

    @RequestMapping("/")
    public String test(){
        return "ok";
    }
}
