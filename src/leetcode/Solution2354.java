package leetcode;
//输出数组重复元素
public class Solution2354 {
    public int findRepeatNumber(int[] nums){
        for(int i=0,n=nums.length;i<n;++i){
          while (nums[i]!=i){    //判断下标值是否和引用值相同
              if(nums[i]==nums[nums[i]]){
                  return nums[i]; //如果元素值等于下标值，返回；
              }
              swap(nums,i,nums[i]);
          }
        }
        return -1;
    }
    public void swap(int[] nums,int i,int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
}
