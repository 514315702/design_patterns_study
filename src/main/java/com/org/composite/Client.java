package com.org.composite;

public class Client {

    public static void main(String[] args) {
        //创建学校（从大到小）
        OrganizationComponent university =  new University("清华大学","顶级学府");
        //创建学院
        OrganizationComponent computerCollege = new College("计算机学院", "计算机学院");
        OrganizationComponent infoEngineeEollege = new College("信息工程学院", "信息工程学院");


        computerCollege.add(new Department("软件工程","软件工程"));
        computerCollege.add(new Department("网络工程","网络工程"));
        computerCollege.add(new Department("计算机科学与技术","计算机科学与技术"));

        infoEngineeEollege.add(new Department("通讯工程","通讯工程"));
        infoEngineeEollege.add(new Department("信息工程","信息工程"));

        //将学院加入学校中
        university.add(computerCollege);
        university.add(infoEngineeEollege);

       university.print();
       //只打印某一个
       computerCollege.print();

    }
}
