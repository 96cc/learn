package com.example.pattern.factory.impl;

import com.example.pattern.factory.Product;

/**
 * @author ctmdt
 * @create 2022-3-1 22:00
 */
public class ConcreteProductB implements Product {

    @Override
    public void use() {
        System.out.println("product B");
    }
}
