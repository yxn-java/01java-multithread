package com.javapractice.Array;

import java.util.Arrays;

public class ArrayFill {
    public static void main(String args[]) {
        int array[] = new int[6];
        Arrays.fill(array, 100);//整个数组都赋值100
        for (int i=0, n=array.length; i < n; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
        Arrays.fill(array, 3, 6, 50);//从第4个到第6个赋值50
        for (int i=0, n=array.length; i< n; i++) {
            System.out.println(array[i]);
        }
    }
}
