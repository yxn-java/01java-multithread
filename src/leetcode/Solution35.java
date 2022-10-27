package leetcode;

public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        //int index=0;
        for(int i=0;i<nums.length;i++){

            if(nums[i]>=target){
                return i;

            }
        }
        return nums.length;
    }
    public static void main(String[] args){
        Solution35 sol=new Solution35();
        int[] a={1,2,5,6};
        int index=sol.searchInsert(a,2);
        System.out.println(index);
    }
}
