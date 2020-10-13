package com.org.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory implements MethodInterceptor {

    //维护一个目标对象

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //返回一个代理对象，是target的代理对象
    public Object getProxyInstance(){
        //1.创建一个工具类
        Enhancer enhancer  = new Enhancer();
        //2.设置一个父类
        enhancer.setSuperclass(target.getClass());
        //3.设置回调函数；
        enhancer.setCallback(this);
        //4.创建子类对象，及代理对象
        return enhancer.create();
    }

    /**
     *
     * 重写INTERCEPET  会调用目标对象
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */


    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib 代理开始 ");
        Object value= method.invoke(target,objects);
        System.out.println("Cglib 代理提交");
        return value;
    }
}
