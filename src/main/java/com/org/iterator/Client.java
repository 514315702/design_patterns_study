package com.org.iterator;

import java.util.ArrayList;
import java.util.List;


/**
 * 迭代器模式
 */
public class Client {
    public static void main(String[] args) {
        List<College> colleges = new ArrayList<College>();

        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        colleges.add(  computerCollege);
        colleges.add(infoCollege);

        OutPutImpl outPut = new OutPutImpl(colleges);
        outPut.printCollege();
    }
}
