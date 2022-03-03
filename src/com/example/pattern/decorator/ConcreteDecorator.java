package com.example.pattern.decorator;

/**
 * @author ctmdt
 * @create 2022-3-1 22:49
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addBehavior();
    }

    public void addBehavior() {
        System.out.println("add behavior");
    }
}
