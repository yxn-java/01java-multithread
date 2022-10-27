package leetcode;

import java.util.ArrayList;
import java.util.List;
//二叉树后序遍历
class Solution145 {
    private ArrayList res;
    public List<Integer> postorderTraversal(TreeNode root) {
        res=new ArrayList<>();
        postorder(root);
        return res;
    }
    public void postorder(TreeNode root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            res.add(root.val);
        }

    }
}
