package com.org.prototype.deep;

import java.io.*;

public class DeepPrototype implements Serializable,Cloneable {
    public String name;
    public DeepClone deepClone;

    public DeepPrototype() {
        super();
    }

    //深拷贝 方式——1
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        deep = super.clone();//对基础及字符串的克隆
        //对引用数据类型单独处理
        DeepPrototype deepPrototype =(DeepPrototype) deep;
        deepPrototype.deepClone = (DeepClone)deepPrototype.clone();
        return deep  ;
    }
    //方式二  通过对象序列化实现,推荐
    public Object deepClone(){
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream  bis= null;
        ObjectInputStream ois =null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos= new ObjectOutputStream(bos);
            oos.writeObject(this);
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepPrototype o = (DeepPrototype)ois.readObject();
            return o;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //关流
            try {
                bos.close();
                oos.close();
                oos.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
       return  null;
    }

}
