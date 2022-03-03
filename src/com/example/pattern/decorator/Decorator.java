package com.example.pattern.decorator;

/**
 * @author ctmdt
 * @create 2022-3-1 22:46
 */
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }

}
