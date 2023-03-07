package com.design.pattern.observer_pattern;

import java.util.ArrayList;
import java.util.List;

// == Observable ==
public class NewsAgency {
    private String news;

    public NewsAgency(String news) {
        this.news = news;
    }

    //List of Subscribers Publisher has to notify, here channels
    private List<Channel> channels = new ArrayList<>();

    //We have ability to add and remove channels
    public void addChannel(Channel channel) {
        this.channels.add(channel);
    }

    public void removeChannel(Channel channel) {
        this.channels.remove(channel);
    }

    public String getNews() {
        return news;
    }

    //When we set/update the news, we also reflect it to its observers/subscribers
    public void setNews(String news) {
        this.news = news;
        for (Channel ch : this.channels) {
            ch.update(this.news);
        }
    }
}
