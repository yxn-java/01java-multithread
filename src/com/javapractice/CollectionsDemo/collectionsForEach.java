package com.javapractice.CollectionsDemo;

import java.util.ArrayList;
import java.util.List;

public class collectionsForEach {
    public static void main(String[] args) {
        List<String> list=new ArrayList();
        list.add("abc");
        list.add("abcde");
        list.add("abcdefg");
        list.add("abcdef");
        list.add("abc");
        for(String str:list){
            System.out.println("variable:" +str);
        }
    }
}
