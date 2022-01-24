package com.base.base.concurrent.actor;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author iceWang
 * @Date 2022/1/20
 * @Description
 **/
@Slf4j
public class DemoCounter {
    static class Counter {
        private int counter;

        public void incr(Integer counter) {
            this.counter += counter;
        }
    }

    @SneakyThrows
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(4);
        Counter counter = new Counter();

        for (int i = 0; i < 4; i++) {
            threadPool.execute(() -> {
                for (int j = 0; j < 100000; j++) {
                    counter.incr(1);
                }
            });
        }

        Thread.sleep(3000);

        log.info("counter:{}", counter.counter);

        threadPool.shutdown();
    }
}
