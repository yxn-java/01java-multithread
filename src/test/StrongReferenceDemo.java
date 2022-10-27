package test;

public class StrongReferenceDemo {
    public static void main(String[] args) {
        Object o1=new Object();
        //强引用
        Object o2=o1;
        o1=null;
        System.gc();
        System.out.println("o2="+o2);
    }
}
