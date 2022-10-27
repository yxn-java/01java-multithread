package com.javapractice.CollectionsDemo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectionsSort {
    public static void main(String[] args) {
        List<String> list=new ArrayList();
        list.add("abc");
        list.add("abcde");
        list.add("abcdefg");
        list.add("abcdef");
        list.add("abc");
        System.out.println("排序前:" +list);
//        Collections.sort(list);
        Collections.sort(list,new stringLengthComparator());
        System.out.println("排序后:" +list);
    }
}
