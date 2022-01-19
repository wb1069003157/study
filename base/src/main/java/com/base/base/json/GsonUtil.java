/*
 * Copyright By ZATI
 * Copyright By 3a3c88295d37870dfd3b25056092d1a9209824b256c341f2cdc296437f671617
 * All rights reserved.
 *
 * If you are not the intended user, you are hereby notified that any use, disclosure, copying, printing, forwarding or
 * dissemination of this property is strictly prohibited. If you have got this file in error, delete it from your system.
 */
package com.base.base.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;

public class GsonUtil {

    private GsonUtil(){

    }

    public static String toJson(Object obj) {
        Gson gson = new Gson();
        return gson.toJson(obj);
    }

    public static <T> T fromJson(String json, Type type) {
        Gson gson = new Gson();
        return gson.fromJson(json, type);
    }

    public static <T> T convertObject(Object source, Type type,String dateFormat) {
        Gson gson = new GsonBuilder().setDateFormat(dateFormat).create();
        String jsonString = gson.toJson(source);
        return gson.fromJson(jsonString, type);
    }

    public static <T> T convertObject(Object source, Type type) {
        return convertObject(source, type,"yyyy-MM-dd HH:mm:ss");
    }

    public static <T> T convertString(String source, Type type) {
        return convertString(source,type,"yyyy-MM-dd HH:mm:ss");
    }

    public static <T> T convertString(String source, Type type,String dateFormat) {
        Gson gson = new GsonBuilder().setDateFormat(dateFormat).create();
        return gson.fromJson(source, type);
    }

}
