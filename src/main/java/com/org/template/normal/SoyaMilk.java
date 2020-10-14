package com.org.template.normal;

/**
 * 抽象豆浆类
 *
 *
 */
public abstract class SoyaMilk {

    //模板方法  模板方法可以做成final  ,不让子类覆盖
    public final void make(){

        select();
        add();
        soak();
        beat();
    }

    public void select(){
        System.out.println("第一步：选择好的新鲜黄豆");
    }

    //添加原材料 不同原材料制作不同的豆浆，抽象方法，子类实现
    public abstract void add();

    //浸泡
    public void soak(){
        System.out.println("第三步，黄豆和配料开始浸泡，需要三个小时");
    }
    public void beat(){
        System.out.println("第四步：将黄豆和配料放入豆浆机");
    }
}
