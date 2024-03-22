package com.example.springbootdemo.demoClass;

public class BlogPost {
    private String title;
    private String author;
    private String content;

    public BlogPost() {
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public BlogPost(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }
}
