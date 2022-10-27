package leetcode;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
//输⼊整数数组 arr ，找出其中最⼩的 k 个数。例如，输⼊4、5、1、6、2、7、3、8这8个 数字，则最⼩的4个数字是1、2、3、4。
class Solution40{
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        } // 默认是小根堆，实现大根堆需要重写一下比较器。
    Queue<Integer> pq = new PriorityQueue<>((v1, v2) -> v2 - v1);
        for (int num: arr) {
            if (pq.size() < k) {
                pq.offer(num);
            } else if (num < pq.peek()) {
                pq.poll();
                pq.offer(num);
            }
        }
        // 返回堆中的元素
    int[] res = new int[pq.size()];
        int idx = 0;
        for(int num: pq) {
            res[idx++] = num;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution40 sol=new Solution40();
        int[] arr=new int[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        int k=5;
        int[] result= sol.getLeastNumbers(arr,k);
        for(int j=0;j<result.length;j++){
            System.out.print(result[j]+" ");
        }
    }
}
