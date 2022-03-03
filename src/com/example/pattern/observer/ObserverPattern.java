package com.example.pattern.observer;

import com.example.pattern.observer.impl.ConcreteObserverA;
import com.example.pattern.observer.impl.ConcreteObserverB;

/**
 * @author ctmdt
 * @create 2022-3-2 20:34
 */
public class ObserverPattern {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer observerA = new ConcreteObserverA();
        Observer observerB = new ConcreteObserverB();
        subject.add(observerA);
        subject.add(observerB);
        subject.setState(0);
    }



}
