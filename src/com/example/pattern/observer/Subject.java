package com.example.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ctmdt
 * @create 2022-3-2 20:16
 */
public abstract class Subject {
    protected List<Observer> observerList = new ArrayList<>();

    public void add(Observer observer) {
        observerList.add(observer);
    }

    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    /**
     * 通知
     */
    public abstract void notified();
}
