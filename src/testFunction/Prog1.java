package testFunction;

import java.util.Scanner;
//斐波那契数列
public class Prog1 {
    private static int NumOfRabbit(int num){
        if(num==1||num==2){
            return 1;
        }
        else{
            return NumOfRabbit(num-1)+NumOfRabbit(num-2);
        }
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int month=scanner.nextInt();
        int result=NumOfRabbit(month);
        System.out.println(result);
    }
}
