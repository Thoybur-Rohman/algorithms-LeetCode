class Solution {
    public boolean checkTree(TreeNode root) {
        boolean isValid = false;
        if(root.left != null && root.right != null){
            if (root.val == (root.right.val + root.left.val)){
                isValid = true;
            }else isValid = false;
        }
        return isValid;
    }
}
