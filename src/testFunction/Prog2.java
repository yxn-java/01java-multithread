package testFunction;

import java.util.Scanner;

import static java.lang.Math.sqrt;
//求101-200范围内素数的个数
public class Prog2 {
    private static boolean isPrime(int n){
        boolean bol=true;
        for(int i=2;i<=sqrt(n);i++){
            if(n%i==0){
                bol=false;
            }
        }
        return bol;
    }
    public static void main(String[] args){
        int numOfPrime=0;
        Scanner input=new Scanner(System.in);
        int min=input.nextInt();
        int max=input.nextInt();
        for(int n=min;n<=max;n++){
            if(isPrime(n)==true){
                System.out.println(n);
                numOfPrime+=1;
            }
        }
        System.out.println(min+"-"+max+"的素数共有："+numOfPrime);
    }
}
