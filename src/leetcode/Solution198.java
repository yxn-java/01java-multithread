package leetcode;

import java.util.Scanner;
//你是⼀个专业的⼩偷，计划偷窃沿街的房屋。每间房内都藏有⼀定的现⾦，影响你偷窃的 唯⼀制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同⼀晚上 被⼩偷闯⼊，系统会⾃动报警。 给定⼀个代表每个房屋存放⾦额的⾮负整数数组，计算你 不触动警报装置的情况下 ，⼀夜 之内能够偷窃到的最⾼⾦额。
class Solution198 {
    public int rob(int[] nums) {
        int len = nums.length;
        if(len == 0)
            return 0;
        int[] dp = new int[len + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for(int i = 2; i <= len; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i-1]);
        }
        return dp[len];
    }

    public static void main(String[] args) {
        Solution198 sol=new Solution198();
        Scanner sc=new Scanner(System.in);
        int[] test=new int[5];
        for(int i=0;i<5;i++){
            test[i]=sc.nextInt();
        }
        int result= sol.rob(test);
        System.out.println(result);
    }
}
