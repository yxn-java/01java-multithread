package com.javapractice.designTypes.singleton01;
//1.单例模式
//Ensure a class has only one instance, and provide a global point of access
//to it.（确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实
//例。）
public class MainWindow {
    //create an object of MainWindow
    private static MainWindow instance = new MainWindow();

    //make the constructor private so that this class cannot be
    //instantiated by other class
    private MainWindow(){}

    //Get the only object available
    public static MainWindow getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("This is a instance.");
    }
}

