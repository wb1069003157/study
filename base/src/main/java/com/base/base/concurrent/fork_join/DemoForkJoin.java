package com.base.base.concurrent.fork_join;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * @Author iceWang
 * @Date 2022/1/19
 * @Description
 **/
@Slf4j
public class DemoForkJoin {

    public static void main(String[] args) {
        // 创建分治任务线程池
        ForkJoinPool forkJoinPool = new ForkJoinPool(8);
        // 创建总任务
        Fibonacci fibonacci = new Fibonacci(30);
        // 启动任务
        Integer result = forkJoinPool.invoke(fibonacci);
        log.info("result:{}", result);
    }

    public static class Fibonacci extends RecursiveTask<Integer> {
        private int i;

        public Fibonacci(int i) {
            this.i = i;
        }

        @Override
        protected Integer compute() {
            if (i <= 1) {
                return i;
            }
            Fibonacci fibonacci1 = new Fibonacci(i - 1);
            // 创建子任务
            fibonacci1.fork();
            Fibonacci fibonacci2 = new Fibonacci(i - 2);
            // 等待子任务结果，并合并结果
            return fibonacci2.compute() + fibonacci1.join();
        }
    }
}
