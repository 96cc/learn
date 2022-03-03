package com.example.reflection.reflection;

/**
 * @author ctmdt
 * @create 2022-3-3 21:11
 */
public class TargetObject {

    private String value;

    public TargetObject() {
        this.value = "cc";
    }

    public void publicMethod(String s) {
        System.out.println("i love" + s);
    }

    private void privateMethod() {
        System.out.println("value is " + value);
    }
}
