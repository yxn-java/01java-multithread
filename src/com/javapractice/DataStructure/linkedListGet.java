package com.javapractice.DataStructure;

import java.util.LinkedList;

public class linkedListGet {
    private LinkedList list = new LinkedList();
    public void push(Object v) {
        list.addFirst(v);
    }
    public Object top() {
        return list.getFirst();
    }
    public Object pop() {
        return list.removeFirst();
    }
    public static void main(String[] args) {
        linkedListGet stack = new linkedListGet();
        for (int i = 30; i < 40; i++)
            stack.push(new Integer(i));
        System.out.println(stack.top()); //返回栈顶元素39
        System.out.println(stack.pop()); //栈顶元素39出栈
        System.out.println(stack.pop()); //栈顶元素38出栈
        System.out.println(stack.pop()); //栈顶元素37出栈
    }
}
