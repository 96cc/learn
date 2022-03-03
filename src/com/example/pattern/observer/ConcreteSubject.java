package com.example.pattern.observer;

/**
 * @author ctmdt
 * @create 2022-3-2 20:29
 */
public class ConcreteSubject extends Subject {
    private Integer state;

    public void setState(Integer state) {
        this.state = state;
        notified();
    }

    @Override
    public void notified() {
        System.out.println("concrete subject update...");
        for (Observer observer : observerList) {
            observer.process();
        }
    }
}
