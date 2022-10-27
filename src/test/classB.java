package test;
import java.net.http.HttpRequest;
import java.util.ArrayList;

public class classB {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(-1);
        list.add(5);
        System.out.println(list);
        try{
            int a=1/0;
        }catch (Exception ex){
            System.out.println ("exception");
        }finally {
            System.out.println("finally");
        }
    }
}
