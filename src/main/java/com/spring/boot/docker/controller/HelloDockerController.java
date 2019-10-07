package com.spring.boot.docker.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/service/docker")
public class HelloDockerController {

    @GetMapping("")
    public String helloDocker() {
        return "hello docker!";
    }
}
