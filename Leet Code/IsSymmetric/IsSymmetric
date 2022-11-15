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
    
    public bool IsSymmetric(TreeNode root) {
    bool ans = true ;
   ans = isSameStructure(root.left, root.right);
    return ans;
    }
    public bool isSameStructure(TreeNode a,TreeNode b)
    {
    // 1. both empty
    if (a == null && b == null) {
       return true; 
    }
    
     if(a==null || b==null){     
            return false;
        }
    if (a.val != b.val){
        return false;
    }
 
    // 2. both non-empty . compare them

    return isSameStructure(a.left, b.right) && isSameStructure(a.right, b.left);   
    
     
    // 3. one empty, one not . false
   
}
}
