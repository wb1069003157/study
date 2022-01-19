package com.base.base.math.bigdecimal;

import java.math.BigDecimal;
import java.util.Optional;

/**
 * @Author iceWang
 * @Date 2021/7/22
 * @Description
 **/
public class BigDecimalUtil {

    /**
     *
     * @param param1
     * @param param2
     * @return
     */
    public static BigDecimal add(BigDecimal param1,BigDecimal param2){
        return param1.add(param2);
    }

    public static BigDecimal add(String param1,String param2) throws Exception {
        BigDecimal a = Optional.ofNullable(param1).map(BigDecimal::new).orElseThrow(NumberFormatException::new);
        BigDecimal b = Optional.ofNullable(param2).map(BigDecimal::new).orElseThrow(NumberFormatException::new);
        return add(a, b);
    }


    /**
     *
     * @param param1
     * @param param2
     * @return
     */
    public static BigDecimal subtract(BigDecimal param1,BigDecimal param2){
        return param1.subtract(param2);
    }

    public static BigDecimal subtract(String param1,String param2) throws Exception {
        BigDecimal a = Optional.ofNullable(param1).map(BigDecimal::new).orElseThrow(NumberFormatException::new);
        BigDecimal b = Optional.ofNullable(param2).map(BigDecimal::new).orElseThrow(NumberFormatException::new);
        return subtract(a,b);
    }

    public static BigDecimal minus(BigDecimal param1,BigDecimal param2){
        return param1.multiply(param2);
    }

    public static BigDecimal minus(String param1,String param2) throws Exception {
        BigDecimal a = Optional.ofNullable(param1).map(BigDecimal::new).orElseThrow(NumberFormatException::new);
        BigDecimal b = Optional.ofNullable(param2).map(BigDecimal::new).orElseThrow(NumberFormatException::new);
        return minus(a,b);
    }

    public static BigDecimal divide(BigDecimal param1,BigDecimal param2){
        return param1.divide(param2);
    }

    public static BigDecimal divide(String param1,String param2) throws Exception {
        BigDecimal a = Optional.ofNullable(param1).map(BigDecimal::new).orElseThrow(NumberFormatException::new);
        BigDecimal b = Optional.ofNullable(param2).map(BigDecimal::new)
                .filter(temp -> temp.compareTo(BigDecimal.ZERO) != 0).orElseThrow(NumberFormatException::new);
        return divide(a,b);
    }

}
