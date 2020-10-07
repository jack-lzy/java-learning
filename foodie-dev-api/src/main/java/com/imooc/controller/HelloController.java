package com.imooc.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("/test")
@Api(tags = "测试")
public class HelloController {

    @GetMapping("/hello")
    public Object hello() {
        return "Hello World";
    }

}
