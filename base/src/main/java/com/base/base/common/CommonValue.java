package com.base.base.common;

import com.base.base.eunm.SubjectEnum;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

/**
 * @Author iceWang
 * @Date 2021/8/4
 * @Description
 **/
@Component
@Getter
@Setter
@ConfigurationProperties("study")
public class CommonValue {

    //@Value("${study.subject}")
    private List<SubjectEnum> subject;

    @Value("${tmp.hello}")
    private String tmp;

    @PostConstruct
    public void init(){
        this.getSubject().forEach(System.out::println);
        System.out.println(tmp);
    }


    public static double getHourDiff(Date startDate, Date endDate) {

        long nd = 1000 * 24 * 60 * 60L;
        long nh = 1000 * 60 * 60L;
        // 获得两个时间的毫秒时间差异
        long diff = endDate.getTime() - startDate.getTime();
        // 计算差多少小时
        return diff * 1.0 % nd / nh;
    }

    public static void main(String[] args) {
        LocalDateTime end = LocalDateTime.of(2022, 10, 11, 23, 59, 59);
        LocalDateTime start = LocalDateTime.of(2021, 10, 12, 0, 0, 0);
        double hourDiff = getHourDiff(Date.from(start.atZone(ZoneId.systemDefault()).toInstant()), Date.from(end.atZone(ZoneId.systemDefault()).toInstant()));
        System.out.println(hourDiff);
        long l = Duration.between(start, end).toHours();
        System.out.println(l);
    }
}