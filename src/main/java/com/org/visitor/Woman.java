package com.org.visitor;

/**
 * 这里我们使用到了双分配，在客户程序中将具体状态传递Woman中（第一次分派）
 *  然后Woman 类调用调用作为参数 ‘具体方法’中方法geWomanResult，同时将自己
 *  作为（this）作为参数传入 ，完成第二次分派
 *
 */
public class Woman extends Person {
    public void accept(Action action) {
        action.geWomanResult(this);
    }
}
