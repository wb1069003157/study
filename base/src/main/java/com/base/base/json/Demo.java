package com.base.base.json;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author iceWang
 * @Date 2021/8/27
 * @Description
 **/
@Slf4j
public class Demo {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();

        Map<String,String> temp = new HashMap<>();
        temp.put("originalDisbursementMethod","CASH");
        temp.put("newDisbursementMethod","CHEQUE");
        student.setField(temp);

        String toJson = GsonUtil.toJson(student.getField());
        person.setField(toJson);
        log.info("toJson:{}",person.getField());



        Map<String,String> result = GsonUtil.convertString(person.getField(),Map.class);
        log.info("result : {}",result);

        String toJson1 = GsonUtil.toJson(result);
        log.info("toJson1:{}",toJson1);



    }

    @Data
    static
    class Person{
        private String field;
    }


    @Data
    static
    class Student{
        private Map field;
    }
}
