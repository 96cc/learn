package com.example.pattern.strategy;

import com.example.pattern.strategy.impl.ConcreteStrategyA;
import com.example.pattern.strategy.impl.ConcreteStrategyB;

/**
 * @author ctmdt
 * @create 2022-3-2 20:02
 */
public class StrategyPattern {

    public static void main(String[] args) {
        Strategy strategyA = new ConcreteStrategyA();
        Strategy strategyB = new ConcreteStrategyB();
        Context context = new Context();
        context.setStrategy(strategyA);
        context.algorithm();
        context.setStrategy(strategyB);
        context.algorithm();

    }


}
