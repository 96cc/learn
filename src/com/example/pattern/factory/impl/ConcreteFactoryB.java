package com.example.pattern.factory.impl;

import com.example.pattern.factory.Factory;
import com.example.pattern.factory.Product;

/**
 * @author ctmdt
 * @create 2022-3-1 22:09
 */
public class ConcreteFactoryB implements Factory {

    @Override
    public Product createProduct() {
        System.out.println("factory B");
        return new ConcreteProductB();
    }
}
