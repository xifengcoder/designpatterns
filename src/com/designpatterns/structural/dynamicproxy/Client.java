package com.designpatterns.structural.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by xifeng.yang on 2020/2/4
 */
public class Client {

    /**
     * 每一个Proxy实例与一个相关联的InvocationHandler对象;
     * Proxy实例上每一个方法的调用都会被分发到InvocationHandler对象的invoke()方法;
     */
    public static void main(String[] args) {
        ICallback realSubject = new RealSubject();

        InvocationHandler handler = new DynamicProxy(realSubject);
        ICallback callback = (ICallback) Proxy.newProxyInstance(
                handler.getClass().getClassLoader(), //获取实际对象所属类的ClassLoader
                new Class<?>[]{ICallback.class}, //获取实际对象的全部接口
                handler //代理对象自身
        );
        System.out.println("callback: " + callback);
        callback.operate1();
        callback.operate2("hello proxy");
    }
}
