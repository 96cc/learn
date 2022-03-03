package com.example.reflection.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author ctmdt
 * @create 2022-3-3 21:03
 */
public class DebugInvocationHandler implements InvocationHandler {

    private final Object targetObject;

    public DebugInvocationHandler(Object targetObject) {
        this.targetObject = targetObject;
    }


    @Override
    public Object invoke(Object object, Method method, Object[] args) {

        System.out.println("before" + method.getName());
        Object result = invoke(targetObject, method, args);
        System.out.println("after" + method.getName());
        return result;
    }

    public static void main(String[] args) {


    }

}
