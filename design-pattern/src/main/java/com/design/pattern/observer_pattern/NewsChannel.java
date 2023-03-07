package com.design.pattern.observer_pattern;

// == Observer ==
public class NewsChannel implements Channel{
    private String news;

    public void setNews(String news) {
        this.news = news;
    }

    public NewsChannel(String news) {
        this.news = news;
    }

    public String getNews() {
        return news;
    }

    @Override
    public void update(Object news) {
//        this.news = (String) news;
        this.setNews((String) news);
    }
}
