package com.org.proxy.cglibproxy;



import com.org.proxy.cglibproxy.TeacherDao;

public class Client {

    public static void main(String[] args) {
        //创建目标对象
        TeacherDao target = new TeacherDao();

        TeacherDao proxy = (TeacherDao)new ProxyFactory(target).getProxyInstance();

        proxy.teach();
    }
}
