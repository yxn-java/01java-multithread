package leetcode;

import java.util.Arrays;
//移动数组中的零到最右边
public class Solution263 {
    public void moveZeroes(int[] nums) {
        int n;
        if (nums == null || (n = nums.length) < 1) {
            return;
        }
        int zeroCount = 0;
        for (int i = 0; i < n; ++i) {
            if (nums[i] == 0) {
        ++zeroCount; }
            else {
                nums[i - zeroCount] = nums[i];
            }
        }
        while (zeroCount > 0) {
            nums[n - zeroCount--] = 0;
        }
    }
    public static void main(String[] args){
        int[] a={1,0,5,0,0,0,3};
        Solution263 sol=new Solution263();
        sol.moveZeroes(a);
        System.out.println(Arrays.toString(a));
    }
}
