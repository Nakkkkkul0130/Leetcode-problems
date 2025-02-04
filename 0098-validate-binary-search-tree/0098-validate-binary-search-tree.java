/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private TreeNode prev = null;
    public boolean isValidBST(TreeNode root) {
        // TreeNode prev=null;
        if(root==null){
            return true;

        }
        if(!isValidBST(root.left)){
            return false;
        }
        if(prev!=null && prev.val>=root.val){
            return false;
        
        }
        prev=root;
        return isValidBST(root.right);
        


    }
}