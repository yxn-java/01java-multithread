package leetcode;

import java.util.Arrays;

public class Solution66 {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        //System.out.println(n);
        int var=digits[n-1];
        //System.out.println(var);
        var=var+1;
        //System.out.println(var);
        return digits;

    }
    public static void main(String[] args){
        int[] a={1,2,5};
        Solution66 sol=new Solution66();
        sol.plusOne(a);
        System.out.println(Arrays.toString(a));
    }
}
