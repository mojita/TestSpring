package com.cn.java8;

/**
 * Created by lijunhong on 16/9/1.
 */
public interface Formula {
    double calculate(int a);

    //1.新特性:Java 8使我们向接口添加非抽象方法实现利用default关键字。这一特性也称为虚拟扩展方法。
    default double sqrt(int a){
        return Math.sqrt(a);
    }
}
