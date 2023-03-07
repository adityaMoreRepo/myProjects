package com.design.pattern.observer_pattern;

public class ObserverPatternDemo {
    //Any change in the state of an observable (Publisher) entity can be
    //published to its listeners/observers/subscribers. We can manage those
    //subscribers. When there is a change in state we notify or publish those changes.
    public static void main(String[] args) {
        //Create channels 1, 2 and 3
        Channel ch1 = new NewsChannel("News about Cat being kidnapped.");
        Channel ch2 = new NewsChannel("News about Cat being kidnapped.");
        Channel ch3 = new NewsChannel("News about Cat being kidnapped.");
        //Create the news Agency
        NewsAgency agency = new NewsAgency("News about Cat being kidnapped.");
        //Add/subscribe channels to that News agency
        agency.addChannel(ch1);
        agency.addChannel(ch2);
        agency.addChannel(ch3);
        //publish news
        agency.setNews("An Elephant lost it's tooth");

        //What is the news on ch3?
        if (ch3 instanceof NewsChannel channel) {
            System.out.println(channel.getNews());
        }
    }


}
