package testFunction;

import java.util.Scanner;

public class Prog4 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        decompose(num);
    }
    private static void decompose(int num){
        for(int i=2;i<=num;i++){
            while(num%i==0&&num!=i){ //执行条件：找到数可整除并且原来的数没有分解到1
                num=num/i;
                System.out.print(i+"*");
            }
            if(num==i){
                System.out.print(i);
                break;
            }
        }

    }
}
