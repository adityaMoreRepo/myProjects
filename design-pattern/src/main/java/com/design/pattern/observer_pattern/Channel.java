package com.design.pattern.observer_pattern;

public interface Channel{
    //Interface to implement for different subscribers
    public void update(Object o);
}
