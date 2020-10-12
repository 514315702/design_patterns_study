package com.org.flyweight;

/**
 * 享元模式
 */
public class Client {
    public static void main(String[] args) {
        //船舰一个工厂类
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        WebSite webSite1 = webSiteFactory.getWebSiteFactory("新闻");
        webSite1.use(new User("tom"));
        WebSite webSite2 = webSiteFactory.getWebSiteFactory("新闻");
        webSite2.use(new User("simth"));
        WebSite webSite3 = webSiteFactory.getWebSiteFactory("新闻");
        webSite3.use(new User("jack"));
        WebSite webSite4 = webSiteFactory.getWebSiteFactory("博客");
        webSite4.use(new User("rose"));
        WebSite webSite5 = webSiteFactory.getWebSiteFactory("博客");



    }
}
