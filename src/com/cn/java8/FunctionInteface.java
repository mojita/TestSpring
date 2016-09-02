package com.cn.java8;

/**
 * Created by lijunhong on 16/9/1.
 */
@FunctionalInterface
public interface FunctionInteface<F,T> {
    T convert(F from);
}
