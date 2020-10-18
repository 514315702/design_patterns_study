package com.org.visitor;

import java.util.LinkedList;
import java.util.List;


//数据结构，管理多个man和woman
public class ObjectStructure {
    private List<Person> personList = new LinkedList<Person>();

    //添加到list
    public void attach(Person person){
        personList.add(person);
    }

    public  void detach(Person person){
        personList.remove(person);
    }

    public void display(Action action){
        for (Person person:personList){
            person.accept(action);
        }
    }

}
