package com.base.base.math;

import lombok.SneakyThrows;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * @Author wangbin
 * @Date 2021/7/20
 * @Description 验证 Math.abs()
 **/
public class AbsDemo {
    @SneakyThrows
    public static void main(String[] args) {
        //int a = Integer.MAX_VALUE;
        //System.out.println(a);
        //System.out.println(Math.abs(a));
        //
        //int b = Integer.MIN_VALUE ;
        //System.out.println(b);
        //System.out.println(Math.abs(b));

        Date date1 = Date.from(LocalDateTime.of(2021,12,1,12,12,12).atZone(ZoneId.systemDefault()).toInstant());

        Date date2 = Date.from(LocalDateTime.of(2020,12,1,12,12,12).atZone(ZoneId.systemDefault()).toInstant());

        Time time = new Time(date1.getTime());
        Time time2 = new Time(date2.getTime());

        System.out.println(time);
        System.out.println(time2);
    }
}
