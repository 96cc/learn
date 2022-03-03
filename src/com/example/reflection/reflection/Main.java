package com.example.reflection.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author ctmdt
 * @create 2022-3-3 21:15
 */
public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class<?> targetClass = Class.forName("com.example.reflection.reflection.TargetObject");
        TargetObject targetObject = (TargetObject) targetClass.newInstance();
        Method[] method = targetClass.getDeclaredMethods();
        for (Method m : method) {
            System.out.println(m.getName());
        }

        Method publicMethod = targetClass.getDeclaredMethod("publicMethod", String.class);
        publicMethod.invoke(targetObject, "caochen");

        Field field = targetClass.getDeclaredField("value");
        field.setAccessible(true);
        field.set(targetObject, "set1");

        Method privateMethod = targetClass.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true);
        privateMethod.invoke(targetObject);
    }
}
