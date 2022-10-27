package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution54 {
    private List<Integer> res;
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        res = new ArrayList<>();
        int i1 = 0, i2 = m - 1;
        int j1 = 0, j2 = n - 1;
        while (i1 <= i2 && j1 <= j2) {
            add(matrix, i1++, j1++, i2--, j2--);
        }
        return res;
    }
    private void add(int[][] matrix, int i1, int j1, int i2, int j2) {
        if (i1 == i2) {
            for (int j = j1; j <= j2; ++j) {
                res.add(matrix[i1][j]);
            }
            return;
        }if (j1 == j2) {
            for (int i = i1; i <= i2; ++i) {
                res.add(matrix[i][j1]);
            }
            return;
        }
        for (int j = j1; j < j2; ++j) {
            res.add(matrix[i1][j]);
        }
        for (int i = i1; i < i2; ++i) {
            res.add(matrix[i][j2]);
        }
        for (int j = j2; j > j1; --j) {
            res.add(matrix[i2][j]);
        }for (int i = i2; i > i1; --i) {
            res.add(matrix[i][j1]);
        }
    }
    public static void main(String[] args){
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        Solution54 sol=new Solution54();
        List<Integer> list=sol.spiralOrder(a);
        System.out.print(list);
        //for(int i=0;i<a.length;i++) {
            //System.out.print(a[i].length+" ");
            //for(int j=0;j<a[i].length;j++)
                //System.out.print(a[i][j]+" ");
            //System.out.println();
        //}
    }
}


