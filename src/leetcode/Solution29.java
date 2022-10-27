package leetcode;

public class Solution29 {
    public int divide(int dividend, int divisor) {
        int result=dividend/divisor;
        int plimit=2147483647;
        int nlimit=-2147483647;

        if(result>plimit){
            result=plimit;
        }
        else if(result<nlimit){
            result=plimit;
        }
        return result;
    }

    public static void main(String[] args) {
        int a=-2147483648;
        int b=-1;
        Solution29 sol=new Solution29();
        System.out.println("variable:" +sol.divide(a,b));
    }
}
