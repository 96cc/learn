package com.example.pattern.factory;

import com.example.pattern.factory.impl.ConcreteFactoryB;

/**
 * @author ctmdt
 * @create 2022-3-1 21:57
 */
public class FactoryMethodPattern {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactoryB();
        Product product = factory.createProduct();
        product.use();
    }
}
