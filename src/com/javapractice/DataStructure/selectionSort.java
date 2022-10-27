package com.javapractice.DataStructure;

import java.util.Arrays;

public class selectionSort {
    private static void selectionSort(int[] nums) { for (int i = 0, n = nums.length; i < n - 1; ++i) { int minIndex = i; for (int j = i; j < n; ++j) { if (nums[j] < nums[minIndex]) { minIndex = j; } }swap(nums, minIndex, i); } }private static void swap(int[] nums, int i, int j) { int t = nums[i]; nums[i] = nums[j]; nums[j] = t; }
    public static void main(String[] args){
        int[] nums={13,14,23,22,21};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
