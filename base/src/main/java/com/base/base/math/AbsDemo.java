package com.base.base.math;

/**
 * @Author wangbin
 * @Date 2021/7/20
 * @Description 验证 Math.abs()
 **/
public class AbsDemo {
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        System.out.println(a);
        System.out.println(Math.abs(a));

        int b = Integer.MIN_VALUE ;
        System.out.println(b);
        System.out.println(Math.abs(b));
    }
}
