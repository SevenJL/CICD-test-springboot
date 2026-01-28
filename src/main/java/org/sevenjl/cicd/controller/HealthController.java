package org.sevenjl.cicd.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class HealthController {
    @GetMapping("/")
    public String test(){
        return "欢迎访问CICD流 自动化部署服务器接口 \n 请访问： www.2cd.online ！";
    }

    @GetMapping("/health")
    public String health(){
        return "服务启动成功！";
    }
    @GetMapping("/health2")
    public String health2(){
        return "服务启动成功2！";
    }

    @GetMapping("/health3")
    public String health3(){
        return "服务启动成功3！";
    }
}
