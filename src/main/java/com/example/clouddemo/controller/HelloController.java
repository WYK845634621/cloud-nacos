package com.example.clouddemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Tips
 * @Author yikai.wang
 * @Number K1171305
 * @Date 2020/11/13 14:37
 */
@RestController
@RefreshScope
public class HelloController {
    @Value("${useLocalCache:false}")
    private boolean useLocalCache;

    @GetMapping("/hello")
    public String hello(){
        return "hello  " + useLocalCache;
    }

    @Value("${isFrom:local}")
    private String isFrom;
    @GetMapping("/where")
    public String where(){
        return "here:  " + isFrom;
    }
}
