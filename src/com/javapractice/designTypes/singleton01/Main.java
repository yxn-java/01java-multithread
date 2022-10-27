package com.javapractice.designTypes.singleton01;
//
public class Main {
    public static void main(String[] args) {
        //Get the only object available
        MainWindow object = MainWindow.getInstance();

        //show the message
        object.showMessage();
    }
}
