package com.cn.java8;

/**
 * Created by lijunhong on 16/9/1.
 */
public class TestLambda {



    public static void runThreadUseLambda(){
        new Thread(()->System.out.println("lambda实现的线程")).start();
    }

    public static void runThreadClass(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("内部实现的线程");
            }
        }).start();
    }

    public static void main(String[] args){
        runThreadUseLambda();
        runThreadClass();
    }
}
