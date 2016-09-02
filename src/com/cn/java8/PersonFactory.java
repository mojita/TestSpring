package com.cn.java8;

/**
 * Created by lijunhong on 16/9/1.
 */
public interface PersonFactory<p extends Person> {
    p create(String firstName,String lastName);
}
