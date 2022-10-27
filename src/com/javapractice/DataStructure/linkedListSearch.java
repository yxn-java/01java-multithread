package com.javapractice.DataStructure;

import java.util.LinkedList;

public class linkedListSearch {
    public static void main(String[] args) {
        LinkedList lList = new LinkedList();
        lList.add("1");
        lList.add("2");
        lList.add("3");
        lList.add("4");
        lList.add("5");
        lList.add("2");
        System.out.println("元素 2 第一次出现的位置：" + lList.indexOf("2"));
        System.out.println("元素 2 最后一次出现的位置："+ lList.lastIndexOf("2"));
        System.out.println("链表第一个元素："+lList.getFirst());
        System.out.println("链表最后一个元素："+lList.getLast());
        lList.addFirst("100");
        System.out.println("当前链表："+lList);
        lList.addLast("100");
        System.out.println("当前链表："+lList);
        lList.removeFirst();
        System.out.println("当前链表："+lList);
        lList.removeLast();
        System.out.println("当前链表："+lList);
        boolean bol1=lList.contains("7");
        boolean bol2=lList.contains("2");
        System.out.println("有无元素7："+bol1);
        System.out.println("有无元素2："+bol2);
        System.out.println("链表长度："+lList.size());
        lList.clear();
        System.out.println("链表长度："+lList.size());
    }
}
