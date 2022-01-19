package com.base.base.concurrent.completion_service;

import cn.hutool.core.util.RandomUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Author iceWang
 * @Date 2022/1/18
 * @Description
 **/
@Slf4j
public class DemoCompletionService {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorCompletionService<String> executorCompletionService = new ExecutorCompletionService(Executors.newCachedThreadPool());
        executorCompletionService.submit(() -> {
            log.info("hello1");
            Thread.sleep(RandomUtil.randomInt(500,2000));
            return "hello1";
        });
        executorCompletionService.submit(() -> {
            log.info("hello2");
            Thread.sleep(RandomUtil.randomInt(500,2000));
            return "hello2";
        });
        executorCompletionService.submit(() -> {
            log.info("hell3");
            //Thread.sleep(RandomUtil.randomInt(500,2000));
            return "hello3";
        });

        for (int i = 0; i < 3; i++) {
            Future<String> take = executorCompletionService.take();
            String result = take.get();
            log.info(result);
        }
        log.info("hello");
    }


}
