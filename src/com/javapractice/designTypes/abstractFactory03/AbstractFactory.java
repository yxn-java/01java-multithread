package com.javapractice.designTypes.abstractFactory03;
//3.抽象工厂模式（Abstract Factory
//Pattern）
//定义：Provide an interface for creating families of related or dependent objects
//without specifying their concrete classes.（为创建一组相关或相互依赖的对象提供
//一个接口，而且无须指定它们的具体类。）
abstract class AbstractFactory {
    abstract Printer getPrinter(String type);
    abstract Shape getShape(String shape);
}
