package com.huangtl.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author huangtl
 * @Date 2020/9/1 17:02
 **/
@RestController
@RequestMapping("/")
public class RootController {

    @RequestMapping("/")
    public String hello(){
        return "这是用户/服务";
    }

    @RequestMapping("/a")
    public String a(){
        return "这是用户/a服务";
    }

    @RequestMapping("/b")
    public String b(){
        return "这是用户/b服务";
    }

    @RequestMapping("/get/a")
    public String geta(){
        return "这是用户/get/a服务";
    }

    @RequestMapping("/delete/a")
    public String deletea(){
        return "这是用户/delete/a服务";
    }
}
