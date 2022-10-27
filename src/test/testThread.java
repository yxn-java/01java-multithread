package test;

public class testThread {
    public static void main(String[] args){
        Thread th1=new Thread("Hello");
        th1.start();
        th1.stop();
        th1.start();
    }


}
