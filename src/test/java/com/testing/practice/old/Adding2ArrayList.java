package com.testing.practice.old;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class Adding2ArrayList {

    @SuppressWarnings("unchecked")
    @Test
    public static void test() {
        // TODO Auto-generated method stub

        List<String> list1 = new ArrayList();
        list1.add("Neeraj");
        list1.add("Kumar");
        list1.add("Bhatnagar");

        List<Integer> list2 = new ArrayList();
        list2.add(2);
        list2.add(3);
        list2.add(4);

        List<String> list3 = new ArrayList();
        list1.add("Neeraj1");
        list1.add("Kumar1");
        list1.add("Bhatnagar1");
        list1.addAll(4, list1);
        //list1.addAll(index, c)

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }

}
