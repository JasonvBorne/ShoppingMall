package com.example.demo.control;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;

@Slf4j
@Controller
public class HelloController {
    @Autowired
    private DataSource dataSource;

    @RequestMapping("/hello")
    @ResponseBody
    public String index(){
        log.info("hello methed is running");
        return "Hello Springboot"+dataSource.toString();
    }
}
