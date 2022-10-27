package com.javapractice.designTypes.abstractFactory03;

class PaperPrinter implements Printer{

    @Override
    public void print() {
        System.out.println("paper");
    }
}
