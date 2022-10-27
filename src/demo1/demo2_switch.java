package demo1;

import java.util.Scanner;

public class demo2_switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1= sc.nextLine();
        switch (str1){
            case "A":
                System.out.println("A");
            case "B":
                System.out.println("B");
            default:
                System.out.println("C");
        };

    }
}
