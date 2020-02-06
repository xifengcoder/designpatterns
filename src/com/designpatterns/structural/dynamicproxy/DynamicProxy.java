package com.designpatterns.structural.dynamicproxy;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {
    // 这个就是我们要代理的真实对象
    private Object subject;

    // 构造方法，给我们要代理的真实对象赋初值
    public DynamicProxy(Object subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object = method.invoke(subject, args);
        System.out.println("method: " + method.getDeclaringClass());
        Annotation[] arrays = method.getAnnotations();
        System.out.println(arrays.length);

        return object;
    }
}
