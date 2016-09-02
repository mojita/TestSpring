package com.cn.test.utf;

import org.springframework.http.converter.StringHttpMessageConverter;

import java.nio.charset.Charset;

/**
 * Created by lijunhong on 16/9/1.
 */
public class StringUTF extends StringHttpMessageConverter {

    public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");



}


