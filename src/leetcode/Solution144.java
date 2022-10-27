package leetcode;

import java.util.ArrayList;
import java.util.List;

//二叉树前序遍历
public class Solution144 {
    private List<Integer> res;
    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return res;
    }
    private void preorder(TreeNode root) {
        if (root != null) {
            res.add(root.val);
            preorder(root.left);
            preorder(root.right);
        }
    }
}
