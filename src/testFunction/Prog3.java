package testFunction;

import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args){

        for(int i=100;i<1000;i++){
            int huns=i/100;
            int ones=i%10;
            int tens=(i-huns*100-ones)/10;
            int sum=huns*huns*huns+tens*tens*tens+ones*ones*ones;
            if(sum==i){
                System.out.println(i);
            }
        }
    }
}
