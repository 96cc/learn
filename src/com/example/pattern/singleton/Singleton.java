package com.example.pattern.singleton;

/**
 * @author ctmdt
 * @create 2022-3-1 22:22
 */
public class Singleton {
    private static volatile Singleton instance = null;

    private Singleton() {
    }

    public Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
