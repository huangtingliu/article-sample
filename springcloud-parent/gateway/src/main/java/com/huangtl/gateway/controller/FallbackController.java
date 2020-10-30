package com.huangtl.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @RequestMapping("/fallback")
    public String fallback(){
        return "这是fallback服务";
    }

    @RequestMapping("/fallback2")
    public String fallback2(){
        return "这是fallback2服务";
    }

    @RequestMapping("/sentinel-fallback")
    public String sentinelFallback(){
        return "这是sentinel-fallback服务";
    }

}
