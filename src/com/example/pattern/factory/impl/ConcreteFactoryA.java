package com.example.pattern.factory.impl;

import com.example.pattern.factory.Factory;
import com.example.pattern.factory.Product;

/**
 * @author ctmdt
 * @create 2022-3-1 22:06
 */
public class ConcreteFactoryA implements Factory {

    @Override
    public Product createProduct() {
        System.out.println("factory A");
        return new ConcreteProductA();
    }
}
