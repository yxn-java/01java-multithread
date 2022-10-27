package com.javapractice.designTypes.factory02;
//2.工厂模式
//定义：Define an interface for creating an object,but let subclasses decide which
//class to instantiate.Factory Method lets a class defer instantiation to subclasses.
//（定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类
//的实例化延迟到其子类。）
public class ShapeFactory {

    //use getShape method to get object of type shape
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}

