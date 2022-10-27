package com.javapractice.CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectionsFill {
    public static void main(String[] args) {
        List<String> list=new ArrayList();
        list.add("abc");
        list.add("abcde");
        list.add("abcdefg");
        list.add("abcdef");
        list.add("abc");
        System.out.println("交换前:" +list);
        Collections.fill(list,"123");
        System.out.println("交换后:" +list);
    }
}
