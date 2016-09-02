package com.cn.test.domain;

/**
 * Created by lijunhong on 16/8/31.
 */
public class Article {

    private int id;
    private String name;
    private String title;

    public Article() {
    }

    public Article(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
