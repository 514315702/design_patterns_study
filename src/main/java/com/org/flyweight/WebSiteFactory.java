package com.org.flyweight;

import java.util.HashMap;

/**
 * 网站工厂类，根据需求返回一个网站
 */
public class WebSiteFactory {
    private HashMap<String,ConcreteWebSite> pool= new HashMap<String, ConcreteWebSite>();


    public WebSite getWebSiteFactory(String type){
        if(!pool.containsKey(type)){
            pool.put(type,new ConcreteWebSite(type));
        }
        return (WebSite)pool.get(type);
    }

    public int getWebSiteCount(){
        return pool.size();
    }
}
