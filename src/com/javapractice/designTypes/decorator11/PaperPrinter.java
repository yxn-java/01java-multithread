package com.javapractice.designTypes.decorator11;

public class PaperPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Paper Printer");
    }
}
