package com.spring.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Author iceWang
 * @Date 2021/7/27
 * @Description
 **/
@Component
public class Student {
    private Integer age;
    final String name = "wangbin";

    @Autowired
    Student student;

    public void say(){
        Date now = new Date();
        LocalDateTime.from(now.toInstant());


        System.out.println(student.name);
    }
}
