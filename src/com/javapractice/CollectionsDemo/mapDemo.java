package com.javapractice.CollectionsDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class mapDemo {
    public static void main(String[] args) {
        Map map=new HashMap<String,String>();
        map.put("111","a");
        map.put("222","b");
        Collection clValue = map.values();
        Collection clKey = map.keySet();
        Iterator itr = clValue.iterator();//使用iterator方法遍历hashmap
        Iterator itr2 = clKey.iterator();//使用iterator方法遍历hashmap
        while (itr.hasNext()) {
            System.out.println("Key:"+itr2.next()+"Values:"+itr.next());
        }
    }
}
