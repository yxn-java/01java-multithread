package test;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num = scanner.nextInt();

        int prime=2;   //从模2开始判断
        while(prime < num){
            if(num % prime == 0){
                System.out.print(num + "不是素数");
                break;
            }else{
                prime++;
            }
        }
        //当prime大于等于num时，表明从2到rootnum中，没有数可以整除num，num是一个素数
        if(prime>=Math.sqrt(num)){
            System.out.print(num + "是素数");
        }
    }
}
