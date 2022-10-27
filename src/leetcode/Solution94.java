package leetcode;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//二叉树中序遍历
public class Solution94 {
    private ArrayList res;
    public List<Integer> inorderTraversal(TreeNode root) {
        res = new ArrayList<>();
        inorder(root);
        return res;
    }
    public void inorder(TreeNode root){
        if(root!=null){
            inorder(root.left);
            res.add(root.val);
            inorder(root.right);
        }
    }
    public static void main(String[] args){
        Solution94 sol=new Solution94();
        TreeNode node=new TreeNode(1);
        sol.inorderTraversal(node);
        System.out.println("\n----------------------");
    }
}
