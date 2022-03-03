package com.example.pattern.observer.impl;

import com.example.pattern.observer.Observer;

/**
 * @author ctmdt
 * @create 2022-3-2 20:27
 */
public class ConcreteObserverA implements Observer {
    @Override
    public void process() {
        System.out.println("concrete observer A");
    }
}
