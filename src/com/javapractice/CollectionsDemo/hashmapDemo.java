package com.javapractice.CollectionsDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

public class hashmapDemo {
    public static void main(String[] args) {
        HashMap< String, String> hMap =
                new HashMap< String, String>();
        hMap.put("1", "1st");
        hMap.put("2", "2nd");
        hMap.put("3", "3rd");
        Collection cl = hMap.values();
        Iterator itr = cl.iterator();//使用iterator方法遍历hashmap
        while (itr.hasNext()) {
            System.out.println("hashMap:"+itr.next());
        }
        //ConcurrentHashMap
        ConcurrentHashMap<Integer,String> hMap2=new ConcurrentHashMap<>();
        hMap2.put(1,"first");
        hMap2.put(2,"");//第二个元素中，ConcurrentHashMap可以用空值
        for(int i=3;i<10;i++){
            hMap2.put(i,"for");
        }
        Collection cl2 = hMap2.values();
        Iterator itr2 = cl2.iterator();
        while (itr2.hasNext()){
            System.out.println("hMap2:"+itr2.next());
        }
        //LinkedHashMap
        LinkedHashMap<Integer,String> hMap3=new LinkedHashMap<>();
        for(int i=1;i<10;i++){
            hMap3.put(i,"for");
        }
        Collection cl3 = hMap3.values();
        Iterator itr3 = cl3.iterator();
        while (itr3.hasNext()){
            System.out.println("hMap3:"+itr3.next());
        }
    }
}
