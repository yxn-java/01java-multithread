package dataStructure;

import java.util.Scanner;

public class sortDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        insertionSort sort=new insertionSort();
        sort.insertionSort(arr);
        for(int i=0;i<10;i++){
            System.out.println("variable:" +arr[i]);
        }
    }
}
