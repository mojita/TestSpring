package com.cn.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 * Created by lijunhong on 16/9/1.
 */
public class ForEach {



    public static void main(String [] args){
//        List<Person> persons =
//        Stream
//        List<Stduent> stduents = Arrays.asList(new Stduent(23),new Stduent(11),new Stduent(100));
//
//        Stream<Stduent> stduentStream = stduents.stream()
//                .filter(stduent -> stduent.getAge()>23)
//                .count();

        test1();

        foreach();
//        Predicate



        List languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");

        System.out.println("Languages which starts with J :");
//        filter(languages, (str)->str.startsWith("J"));

        System.out.println("Languages which ends with a ");
//        filter(languages, (str)->str.endsWith("a"));

        System.out.println("Print all languages :");
        filter(languages, (str)->true);

        System.out.println("Print no language : ");
//        filter(languages, (str)->false);

        System.out.println("Print language whose length greater than 4:");
//        filter(languages, (str)->str.length() > 4);

    }

    public static void filter(List names, Predicate condition) {
        names.stream().filter((name) -> (condition.test(name)))
                .forEach((name) -> {
                    System.out.println(name + " ");
                });
    }

    public static void foreach() {
        List names = Arrays.asList("asdasd","asdasd","qweqwe","momiiki","thihiasd");
        names.forEach(n->System.out.println(n));
    }


    /**
     * springmvc+hibernate+spring
     * 1.
     *
     */

    //顺序和多核处理集合数据
    public static void test1() {
        long t0 = System.nanoTime();

        //初始化一个范围100万整数流,求能被2整除的数字，toArray（）是终点方法

        int a[]= IntStream.range(0, 1_000_000).filter(p -> p % 2==0).toArray();

        long t1 = System.nanoTime();

        //和上面功能一样，这里是用并行流来计算

        int b[]=IntStream.range(0, 1_000_000).parallel().filter(p -> p % 2==0).toArray();

        long t2 = System.nanoTime();

        //我本机的结果是serial: 0.06s, parallel 0.02s，证明并行流确实比顺序流快

        System.out.printf("serial: %.2fs, parallel %.2fs%n", (t1 - t0) * 1e-9, (t2 - t1) * 1e-9);




    }
}
