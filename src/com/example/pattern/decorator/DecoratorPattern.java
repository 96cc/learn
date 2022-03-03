package com.example.pattern.decorator;

import com.example.pattern.decorator.impl.ConcreteComponent;

/**
 * @author ctmdt
 * @create 2022-3-1 22:54
 */
public class DecoratorPattern {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.operation();
        Component decorator = new Decorator(component);
        decorator.operation();
        Component concreteDecorator = new ConcreteDecorator(component);
        concreteDecorator.operation();
    }
}
