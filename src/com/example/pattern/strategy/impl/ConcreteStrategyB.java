package com.example.pattern.strategy.impl;

import com.example.pattern.strategy.Strategy;

/**
 * @author ctmdt
 * @create 2022-3-2 19:58
 */
public class ConcreteStrategyB implements Strategy {

    @Override
    public void algorithm() {
        System.out.println("concrete strategy B");
    }
}
