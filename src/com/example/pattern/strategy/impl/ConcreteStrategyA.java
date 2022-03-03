package com.example.pattern.strategy.impl;

import com.example.pattern.strategy.Strategy;

/**
 * @author ctmdt
 * @create 2022-3-2 19:55
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void algorithm() {
        System.out.println("concrete strategy A");
    }
}
