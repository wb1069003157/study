package com.spring.spring.controller;

import com.spring.spring.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author iceWang
 * @Date 2021/7/27
 * @Description
 **/
@Controller
public class TestController {
    @Autowired
    Student student;

    @GetMapping("/test")
    public void test(){
        student.say();
    }
}
