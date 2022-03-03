package com.example.pattern.decorator.impl;

import com.example.pattern.decorator.Component;

/**
 * @author ctmdt
 * @create 2022-3-1 22:41
 */
public class ConcreteComponent implements Component {

    public ConcreteComponent() {
        System.out.println("concrete component constructor");
    }


    @Override
    public void operation() {
        System.out.println("concrete component operation");
    }
}
