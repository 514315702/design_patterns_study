package com.org.proxy.dynamicproxy;



public class Client {

    public static void main(String[] args) {
        //创建目标对象
        ITheacherDao target = new TeacherDao();

        ITheacherDao proxyInstance = (ITheacherDao)new ProxyFactory(target).getProxyInstance();

        //内存中生成了代理对象proxyInstance = class com.sun.proxy.$Proxy0
        System.out.println("proxyInstance = "+proxyInstance.getClass());

        proxyInstance.teach();

        System.out.println("------------------");

        proxyInstance.sayHallo("handson");
    }
}
