package com.javapractice.designTypes.proxy06;




public class Main {

    public static void main(String[] args) {
        Printer image = new ProxyPrinter("test");
        image.print();
    }
}

