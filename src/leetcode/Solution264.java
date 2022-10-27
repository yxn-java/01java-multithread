package leetcode;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
//我们把只包含质因⼦ 2、3 和 5 的数称作丑数（Ugly Number）。求按从⼩到⼤的顺序的 第 n 个丑数。
class Solution264 {
    private int[] uglyNumber = {2,3,5};
    public int nthUglyNumber(int n) {
        Set<Long> set = new HashSet<>();
        //创建小根堆，每次出堆的都是最小值
     PriorityQueue<Long> queue = new PriorityQueue<>();
     queue.add(1L);
     //记录出堆的个数，出堆的元素完全按照从小到大排序

     int count = 0;
     while (! queue.isEmpty()){
         long cut = queue.poll();
         //如果出堆的个数>=n,当前cut就是第n个丑数
         if(++count >= n){
             return (int) cut;
         }
         for(int num : uglyNumber){
             //排除重复的数字

         if(! set.contains(num * cut)){
             queue.add(num * cut);
             set.add(num * cut);
         }
         }
     }
     return -1;
    }

    public static void main(String[] args) {
        Solution264 sol=new Solution264();
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int result= sol.nthUglyNumber(k);
        System.out.println(result);
    }
}
