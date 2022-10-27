package dataStructure;

import java.lang.reflect.Array;
import java.util.Arrays;
/**
 * 冒泡排序
 *
 * ①. 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * ②. 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
 * ③. 针对所有的元素重复以上的步骤，除了最后一个。
 * ④. 持续每次对越来越少的元素重复上面的步骤①~③，直到没有任何一对数字需要比较。
 * 时间复杂度O(N²)
 */
public class bubbleSort {
    private static void bubbleSort(int arr[]){
        for(int i=arr.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                System.out.println("variable:" + Arrays.toString(arr));
            }
        }
    }
}
