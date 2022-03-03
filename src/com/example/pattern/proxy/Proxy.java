package com.example.pattern.proxy;

import com.example.pattern.proxy.impl.RealSubject;

/**
 * @author ctmdt
 * @create 2022-3-2 20:11
 */
public class Proxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        afterRequest();
    }

    public void preRequest() {
        System.out.println("pre");
    }

    public void afterRequest() {
        System.out.println("after");
    }
}
