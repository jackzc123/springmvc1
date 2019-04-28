package com.usoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zc
 * @create 2019-04_28-8:19
 */
@Controller
public class HelloController {

    @RequestMapping("/hello/{id}")
    public String hello(@PathVariable("id") Integer id){
        System.out.println(id);
        return "success";
    }

}
