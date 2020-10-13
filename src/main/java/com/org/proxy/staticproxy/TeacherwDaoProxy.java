package com.org.proxy.staticproxy;

/**
 * 代理对象  静态代理
 */
public class TeacherwDaoProxy  implements ITheacherDao{
    private ITheacherDao target; //目标对象，通过接口聚合


    public TeacherwDaoProxy(ITheacherDao target) {
        this.target = target;
    }


    public void teach() {
        System.out.println("代理开始。。。");

        target.teach();
        System.out.println("代理结束。。。");
    }
}
