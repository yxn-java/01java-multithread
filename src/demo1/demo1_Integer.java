package demo1;

public class demo1_Integer {
    public static void main(String[] args) {
        Integer f1=100,f2=100,f3=150,f4=150;
        System.out.println(f1==f2);//整型字面量的值在-128 到 127 之间，那么不会 new 新的 Integer对象，而是直接引用常量池中的 Integer 对象
        System.out.println(f3==f4);//对象值不在[-128,127]范围内
    }
}
