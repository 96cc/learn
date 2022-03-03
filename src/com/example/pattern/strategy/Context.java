package com.example.pattern.strategy;

/**
 * @author ctmdt
 * @create 2022-3-2 20:00
 */
public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void algorithm() {
        strategy.algorithm();
    }

}
