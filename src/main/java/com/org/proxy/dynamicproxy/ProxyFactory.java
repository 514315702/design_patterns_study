package com.org.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    //维护一个目标对象

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //给目标对象生成一个代理对象
    public Object getProxyInstance(){

        /**
         * 1.ClassLoader loader 指定当前目标对象使用的类加载器，获得加载器的方法固定s
         * 2.Class<?>[] interfaces 目标对象实现的接口类型，使用泛型方法确认类型
         * 3. InvocationHandler h 事情处理，执行目标对象方法时，会触发事情处理器方法，会把当前执行的目标对象方法作为参数传入
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("JDK代理开始");
                Object retrunVar = method.invoke(target, args);
                System.out.println("JDK 代理提交");
                return retrunVar;
            }
        });
    }
}
