package com.org.proxy.staticproxy;

/**
 * 优点： 在不修改对象的功能前提下，能通过代理对象对目标进行拓展
 * 缺点： 因为代理对象需要和目标对象实现一样的接口，所以或有很多代理类一点接口增减方法，目标与代理对象都要维护
 */
public class Client {

    public static void main(String[] args) {
        //创建目标对象
        TeacherDao teacherDao = new TeacherDao();

        //创建代理对象，同时将被代理对象传递给代理方法
        TeacherwDaoProxy teacherwDaoProxy = new TeacherwDaoProxy(teacherDao);


        //通过代理对象，调用被代理对象方法
        //即：执行带对象方法，代理再去调用目标对象的方法
        teacherwDaoProxy.teach();
    }
}
