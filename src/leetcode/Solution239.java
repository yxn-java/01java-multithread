package leetcode;

import java.util.PriorityQueue;
import java.util.Scanner;
//给你⼀个整数数组 nums，有⼀个⼤⼩为 k 的滑动窗⼝从数组的最左侧移动到数组的最右 侧。你只可以看到在滑动窗⼝内的 k 个数字。滑动窗⼝每次只向右移动⼀位。 1 // 保持堆的大小为K，然后遍历数组中的数字，遍历的时候做如下判断：
//返回滑动窗⼝中的最⼤值。 示例 1： 输⼊：nums = [1,3,-1,-3,5,3,6,7], k = 3 输出：[3,3,5,5,6,7]
public class Solution239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;  //这里我们传入了一个比较器，当两者的值相同时，比较下标的位置，下标大的在前面。
        PriorityQueue<int[]> queue = new PriorityQueue<>((p1, p2) -> p1[0] != p2[0] ? p2[0] - p1[0] : p2[1] - p1[1]);
        //初始化前K的元素到堆中
        for (int i = 0; i < k; i++) {
            queue.offer(new int[]{nums[i], i});
        }
    int[] ans = new int[n - k + 1];
        //将第一次答案加入数据
        ans[0] = queue.peek()[0];
        for (int i = k; i < n; i++) {
            //将新元素加入优先队列
            queue.offer(new int[]{nums[i], i});
            //循环判断当前队首是否在窗口中，窗口的左边界为i-k
            while (queue.peek()[1] <= i - k) {
                queue.poll();
            } //在窗口中直接赋值即可
            ans[i - k + 1] = queue.peek()[0];
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution239 sol=new Solution239();
        Scanner sc=new Scanner(System.in);
        int[] arr1=new int[8];
        for(int i=0;i<8;i++){
            arr1[i]=sc.nextInt();
        }
        int k= 3;
        int[] result= sol.maxSlidingWindow(arr1,k);
        for(int j=0;j< result.length;j++){
            System.out.print(result[j]+" ");
        }
    }
}
