package com.javapractice.designTypes.abstractFactory03;

public class ScreenPrinter implements Printer{

    @Override
    public void print() {
        System.out.println("screen");
    }
}
