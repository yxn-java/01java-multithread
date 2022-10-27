package com.javapractice.designTypes.templateMethod04;
//4.模板方法模式（Template Method
//Pattern）
//定义：Define the skeleton of an algorithm in an operation,deferring some steps to
//subclasses.Template Method lets subclasses redefine certain steps of an
//algorithm without changing the algorithm's structure.（定义一个操作中的算法的框
//架，而将一些步骤延迟到子类中。使得子类可以不改变一个算法的结构即可重定义
//该算法的某些特定步骤。）



public class Main {
    public static void main(String[] args) {
        Software s1 = new Browser();
        s1.play();
        s1 = new Editor();
        s1.play();
    }
}

