package test;

import java.lang.ref.SoftReference;

public class SoftReferenceDemo {
    public static void main(String[] args) {
        Object o1=new Object();
        SoftReference<Object> ref=new SoftReference<>(o1);
        System.out.println(o1);
        System.out.println(ref.get());
    }
}
