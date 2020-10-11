package com.org.factory.absfactory.order;

import com.org.factory.absfactory.pizza.Pizza;

/**
 * 建立一个抽象层（几口）
 */
public interface AbsFactory {
    public Pizza createPizza(String orderType);


}
