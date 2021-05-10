package com.testing.practice.old;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayListToArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("C");
        list.add("E");

        String[] list2 = new String[list.size()];
        list2 = list.toArray(list2);
        for (int i = 0; i < list2.length; i++) {
            System.out.println(list2[i]);
        }

    }

}
