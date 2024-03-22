package com.example.springbootdemo.main;

import com.example.springbootdemo.demoClass.BlogPost;

import java.util.List;
import java.util.stream.Collectors;

public class CollectionDemoMain {
    public static void main(String[] args) {
        var listOfName = List.of("John", "Jane", "Adam", "Tom");
        listOfName.stream()
                .map(String::length)
                .toList()
                .forEach(System.out::println);
        var blogpost1 = new BlogPost("title1", "author1", "content1");
        var blogpost2 = new BlogPost("title2", "author2", "content2");
        var blogpost3 = new BlogPost("title3", "author3", "content3");
        var blogpost4 = new BlogPost("title4", "author1", "content4");
        var blogpost5 = new BlogPost("title5", "author2", "content5");
        var listOfBlogPost = List.of(blogpost1, blogpost2, blogpost3, blogpost4, blogpost5);
        var groupByAuthor = listOfBlogPost.stream()
                .collect(Collectors.groupingBy(BlogPost::getAuthor));
        groupByAuthor.entrySet().forEach(e -> {
            System.out.println(e.getKey() + " : ");
            e.getValue().forEach(b -> System.out.println("      " + b.getTitle()));
        });

        //calculate the total number of characters (i.e., the sum of the lengths) of the titles of all blog posts
        var totalNumberOfCharacters = listOfBlogPost.stream()
                .map(BlogPost::getTitle)
                .mapToInt(String::length)
                .sum();
        //OR
        var totalNumberOfCharacters2 = listOfBlogPost.stream()
                .map(b -> b.getTitle().length())
                .reduce(0, Integer::sum);
        System.out.println("totalNumberOfCharacters: " + totalNumberOfCharacters
                + "\ntotalNumberOfCharacters2: " + totalNumberOfCharacters2);
    }
}
