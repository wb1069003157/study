package com.base.base.eunm;

import lombok.Getter;

/**
 * @Author wangbin
 * @Date 2021/7/13
 * @Description
 **/
@Getter
public enum SubjectEnum {
    CHINESE(0,"语文"),
    MATH(1,"数学"),
    @Deprecated
    ENGLISH(2,"英语(淘汰)"),
    ;

    private Integer code;
    private String desc;

    private SubjectEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
