package com.base.base.threadlocal;

import lombok.SneakyThrows;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author iceWang
 * @Date 2022/1/20
 * @Description
 **/
public class DemoSimpleDateFormat {
    static final ThreadLocal<DateFormat> dateTimeFormat =
            ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));

    static DateFormat get() {
        return dateTimeFormat.get();
    }

    @SneakyThrows
    public Date string2Date(String date){
        return get().parse(date);
    }
}
