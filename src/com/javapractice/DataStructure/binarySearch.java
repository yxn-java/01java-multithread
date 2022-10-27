package com.javapractice.DataStructure;

public class binarySearch {
    private static int search(int[] nums,int low,int high,int val){
        while (low<=high){
            int mid=(low+high)/2>>>1;
            if(val==nums[mid]){
                return mid;
            }
            else if(val>nums[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        return -1;

    }
    private static int search(int[] nums,int val){
        return search(nums,0, nums.length-1,val );
    }
    public static void main(String[] args){
        int[] a={11,12,13,14,15,16};
        int r1=search(a,13);
        System.out.println(r1);
    }
}
