package com.example.pattern.proxy.impl;

import com.example.pattern.proxy.Subject;

/**
 * @author ctmdt
 * @create 2022-3-2 20:09
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("realSubject request");
    }
}
