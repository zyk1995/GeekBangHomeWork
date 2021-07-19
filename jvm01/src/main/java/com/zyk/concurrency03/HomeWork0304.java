package com.zyk.concurrency03;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

public class HomeWork0304 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        long start=System.currentTimeMillis();
        AtomicInteger result = new AtomicInteger();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new  Thread(() -> { result.set(sum()); countDownLatch.countDown(); }).start();
        countDownLatch.await();


        System.out.println("异步计算结果为："+result);
        System.out.println("使用时间："+ (System.currentTimeMillis()-start) + " ms");
    }

    private static int sum() {
        return fibo(36);
    }

    private static int fibo(int a) {
        if ( a < 2)
            return 1;
        return fibo(a-1) + fibo(a-2);
    }
}
