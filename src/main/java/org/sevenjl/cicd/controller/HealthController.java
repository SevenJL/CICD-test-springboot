package org.sevenjl.cicd.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class HealthController {

    @GetMapping("/health")
    public String health(){
        return "服务启动成功！";
    }
    @GetMapping("/health2")
    public String health2(){
        return "服务启动成功2！";
    }
}
