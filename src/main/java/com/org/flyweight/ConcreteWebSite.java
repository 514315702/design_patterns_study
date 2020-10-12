package com.org.flyweight;

public class ConcreteWebSite  extends WebSite{
    private String type = ""; //类型 内部状态

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为："+type+"使用者是"+user.getName() );
    }
}
