package com.base.base.concurrent.completable_future;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.concurrent.CompletableFuture;

/**
 * @Author iceWang
 * @Date 2022/1/18
 * @Description
 **/
@Slf4j
public class DemoCompletableFuture {

    public static void main(String[] args) throws InterruptedException {
        CompletableFuture<String> task1 = CompletableFuture.supplyAsync(() -> {
            log.info("Thread name:{},time:{}", Thread.currentThread().getName(), LocalDateTime.now());
            log.info("Task 1 正在执行");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "hello";
        });

        CompletableFuture<String> task2 = CompletableFuture.supplyAsync(() -> {
            log.info("Thread name:{},time:{}", Thread.currentThread().getName(), LocalDateTime.now());
            log.info("Task 2 正在执行");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "hello";
        });

        CompletableFuture<String> task3 = task1.applyToEither(task2, (s) -> {
                    log.info("Thread name:{},time:{}", Thread.currentThread().getName(), LocalDateTime.now());
                    log.info("Task 3 正在执行");
                    return s;
                }
        );

        Thread.sleep(10000);
    }
}
