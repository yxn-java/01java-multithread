package leetcode;

import java.util.*;
//给你一个整数数组 nums 和一个整数 k ，请你返回其中出现频率前 k 高的元素。你可以按 任意顺序 返回答案。
class Solution347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        // 使用字典，统计每个元素出现的次数，元素为键，元素出现的次数为值

     HashMap<Integer,Integer> map = new HashMap();
     for(int num : nums){
         if (map.containsKey(num)) {
             map.put(num, map.get(num) + 1);
         } else {
             map.put(num, 1);
         }
     }
     // 遍历map，用最小堆保存频率最大的k个元素

     PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
         @Override
         public int compare(Integer a, Integer b) {
             return map.get(a) - map.get(b);
         }
     });
     for (Integer key : map.keySet()) {
         if (pq.size() < k) {
             pq.add(key);
         } else if (map.get(key) > map.get(pq.peek())) {
             pq.remove();
             pq.add(key);
         }
     }
     // 取出最小堆中的元素

     List<Integer> res = new ArrayList<>();
     while (!pq.isEmpty()) {
         res.add(pq.remove());
     }
     return res;
    }

    public static void main(String[] args) {
        Solution347 sol=new Solution347();
        Scanner sc=new Scanner(System.in);
        int[] nums=new int[10];
        for(int i=0;i<10;i++){
            nums[i]=sc.nextInt();
        }
        int k=3;
        List<Integer> result=sol.topKFrequent(nums,k);
        System.out.println(result);

    }
}
