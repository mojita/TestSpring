package com.cn.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by lijunhong on 16/9/1.
 */
public class FormulaMain {
    public static void main(String [] args){
        getFormulaTest();
        getLambda();
        FunctionalIntface();
        getMethodAndConstructorReferences();
        getObjeatMethod();
        getCreatePerson();



    }

    public static void getCreatePerson() {
        //通过::创建对象
        PersonFactory personFactory = Person::new;
        Person person = personFactory.create("oo","xx");
        System.out.println(person.toString());
    }

    public static void getObjeatMethod() {
        //通过::引用object对象方法
        Somthing somthing = new Somthing();
        FunctionInteface<String,String> convert = somthing::startWith;
        String converted = convert.convert("java");
        System.out.println(converted);
    }

    public static void getMethodAndConstructorReferences() {
        //方法和构造函数的引用
        FunctionInteface<String,Integer> convert = Integer::valueOf;
        Integer converted = convert.convert("123");
        System.out.println(converted);
    }

    public static void FunctionalIntface() {
        //3.功能接口Functional Interfaces(只有使用@FunctionalInterface)的接口才能使用lambda表达式
        FunctionInteface<String,Integer> convert = (from) -> Integer.valueOf(from);
        Integer converted = convert.convert("123");
        System.out.println(converted);
    }

    public static void getLambda() {
        //2.lambda

        List<String> names = Arrays.asList("name","test","tom");

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        //变得更短
        Collections.sort(names,(String a,String b)->{
            return a.compareTo(b);
        });

        //去掉括号和返回值
        Collections.sort(names,(String a,String b)->a.compareTo(b));

        //劲爆的
        names.sort((a,b)->a.compareTo(b));
    }

    public static void getFormulaTest() {
        //1.除了接口抽象方法计算公式还定义了默认的方法返回值。具体类实现抽象方法只能计算。默认的方法大概可以开箱即用的使用。
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a*100);
            }
        };

        formula.calculate(100);          //100
        double temp = formula.sqrt(16);  //4
        System.out.println(temp);       //4
    }
}
