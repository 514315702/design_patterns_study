package com.org.memento.game;

public class GameRole {

    private int vit;
    private int def;

    //创建备忘录对象
    public Memento createMemento(){
        return new Memento(vit,def);
    }
    //恢复
    public void recoverGameRoleFromMemento(Memento memento){
        this.def = memento.getDef();
        this.vit = memento.getVit();
    }

    public void display(){
        System.out.println("当前角色攻击力和防御力："+this.vit +" ---"+this.def);
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
