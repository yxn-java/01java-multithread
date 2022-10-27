package test;

import java.lang.ref.WeakReference;

public class WeakReferenceDemo {
    public static void main(String[] args) {
        Object o1=new Object();
        WeakReference<Object> ref1=new WeakReference<>(o1);
        System.out.println("variable:" +o1);
        System.out.println(ref1.get());

        //执行GC，会直接清除弱引用
        o1=null;
        System.gc();
        System.out.println("variable:" +"==================");
        System.out.println("variable:" +o1);
        System.out.println(ref1.get());
    }
}
