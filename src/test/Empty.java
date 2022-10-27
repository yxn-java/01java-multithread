package test;

import static test.A.bol;
import static test.A.f;

class A{
    static float f;
    static boolean bol;
}
public class Empty {
    public static void main(String[]args){
        int x=3;
        int y=1;
        float f1;
        //System.out.println(f1);
        char c=65;
        System.out.println(c);
        //int[] myArray={"1","2"};
        StringBuffer a = new StringBuffer("Nowcoder");
        StringBuffer b = new StringBuffer("Google");
        a.delete(1,3);
        a.append(b);
        System.out.println(a);
        int int1=4;
        System.out.println(int1++);
        String s1 = "nowcoder";
        String s2 = "nowcoder";
        System.out.println("s1 == s2 is:" + s1 == s2);
        System.out.println("boolean默认值"+bol);
        System.out.println("float默认值"+f);
        int a1 = 5;
        double a2 =(float)a1;
        System.out.println(a2);

    }
}
