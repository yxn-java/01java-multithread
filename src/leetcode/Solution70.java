package leetcode;

public class Solution70 {
    public int climbStairs(int n) {
            if (n == 1||n==2) {
                return n;
            }
            else{
                return climbStairs(n - 1) + climbStairs(n - 2);
            }

        }
        public static void main(String[] args) {
            Solution70 sol=new Solution70();
            int result=sol.climbStairs(45);
            System.out.println( result);
        }

}
