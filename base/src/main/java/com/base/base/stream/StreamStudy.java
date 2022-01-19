package com.base.base.stream;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.stream.Stream;

/**
 * @Author iceWang
 * @Date 2021/9/10
 * @Description
 **/
public class StreamStudy {
    public static void main(String[] args) {
        Integer s = Stream.of(
                Teacher.builder().age(null).build(),
                Teacher.builder().age(1).build(),
                Teacher.builder().age(2).build() )
                .map(Teacher::getAge)
                .findFirst()
                .get();
        System.out.println(s);
    }

    @AllArgsConstructor
    @Builder
    @ToString
    @Data
    static class Teacher{
        Integer age;
    }
}
