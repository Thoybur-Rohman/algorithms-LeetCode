/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public bool HasPathSum(TreeNode root, int targetSum) {
        return helper(root,targetSum);
    }
      bool helper(TreeNode root, int targetSum){
        if(root==null){
            return false;
        }
        bool result=false;
        if(targetSum - root.val==0 && root.left==null && root.right==null){
            return true;
        }
        
        if(root.left!=null){
            result=result || helper(root.left,targetSum-root.val);
        }
        if(root.right!=null){
            result=result || helper(root.right,targetSum-root.val);
        }
        return result;
    }
}
