package com.base.base.optional;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Author wangbin
 * @Date 2021/7/21
 * @Description
 **/
public class FunctionalDemo {
    static Consumer print = System.out::println;

    public static void main(String[] args) {
        supplier();
    }

    public static void predicate(){
        IntPredicate evenNumber = t -> t % 2 == 0;
        IntPredicate moreThanZero = t -> t > 0;
        IntPredicate tailEqualsFive = t -> t % 5 ==0;
        // 满足 (大于0的偶数) || 位数是0或5的数
        IntStream.of(-1,-2,-10,1,2,4,5,45,75,80)
                .filter((evenNumber.and(moreThanZero)).or(tailEqualsFive))
                .forEach(System.out::println);
    }

    public static void comsumer(){
        Consumer<Student> modifyAge = student -> student.setAge(student.age * 2);
        Consumer<Student> modifyName = student -> student.setName(student.name.toUpperCase());
        Student student1 = new Student(10,"rose");
        Student student2 = new Student(20,"jack");
        Stream.of(student1,student2)
                .forEach(modifyAge.andThen(modifyName).andThen(print));
    }

    public static void function(){
        Function<Student,Integer> modifyAndGetAge = student -> student.age * 2;
        Student student1 = new Student(10,"rose");
        Student student2 = new Student(20,"jack");
        Stream.of(student1,student2)
                .map(modifyAndGetAge)
                .forEach(print);
        Supplier<Integer> nextIntRandom = () -> ThreadLocalRandom.current().nextInt();
        System.out.println(Optional.ofNullable(null).orElseGet(nextIntRandom));
    }

    public static void supplier(){
        Supplier<Integer> nextIntRandom = () -> ThreadLocalRandom.current().nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println(Optional.ofNullable(null).orElseGet(nextIntRandom));
        }
    }



    @Data
    @AllArgsConstructor
    static class Student{
        private Integer age;
        private String name;
    }
}
