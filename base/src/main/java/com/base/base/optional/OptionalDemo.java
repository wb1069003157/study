package com.base.base.optional;

import java.util.Arrays;
import java.util.List;

/**
 * @Author wangbin
 * @Date 2021/7/21
 * @Description 验证一下 map 和 flatMap 的区别
 **/
public class OptionalDemo {
    public static void main(String[] args) {
        testMap();

        testFlatMap();
    }

    public static void testMap(){
        List<Integer> temp1 = Arrays.asList(1,2,3,4,5);
        List<Integer> temp2 = Arrays.asList(-1,-2,-3,-4,-5);
        List<List<Integer>> listList = Arrays.asList(temp1, temp2);
        listList.stream()
                .map(temp -> temp.stream().map(y -> ++y))
                .forEach(temp -> temp.forEach(System.out::println));
    }

    public static void testFlatMap(){
        List<Integer> temp1 = Arrays.asList(1,2,3,4,5);
        List<Integer> temp2 = Arrays.asList(-1,-2,-3,-4,-5);
        List<List<Integer>> listList = Arrays.asList(temp1, temp2);
        listList.stream()
                .flatMap(temp -> temp.stream().map(y -> --y))
                .forEach(System.out::println);
    }


}
