package demo1;

public class demo4_hashcode {
    public static void main(String[] args) {
        Integer a=3,b=3;
        System.out.println(a.equals(b));
        System.out.println(a.hashCode()==b.hashCode());
    }
}
