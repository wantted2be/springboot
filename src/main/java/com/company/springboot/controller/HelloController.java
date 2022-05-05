package com.company.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wlb10
 * @PackageName boot-01-helloworld
 * @Package com.company.springboot.boot.controller
 * @Date 2022/4/27 16:45
 * @Version 1.0
 */
//@ResponseBody  //方法返回值就是响应体，不在是视图
//@Controller
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello,SpringBoot" + "你好";
    }
}
