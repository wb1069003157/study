package com.base.base.string;

import java.util.StringJoiner;

/**
 * @Author wangbin
 * @Date 2021/7/20
 * @Description
 **/
public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner a = new StringJoiner(":","[","]");
        a.add("test1").add("test2");

        StringJoiner b = new StringJoiner(",","(",")");
        b.add("qwe").add("asd").add("qqq");

        // 将后来的元素 prefix 截掉，然后直接赋值到原先元素的后面
        // 原先元素的后缀不变，且两者之间用原先元素的 delimiter 来连接
        a.merge(b);

        System.out.println(a);

    }
}
