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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ln = new ArrayList<>();
        helper(root,ln);
        return ln;
    }


        private void helper(TreeNode root, List<Integer> ln){
            if(root==null){
                return;
            }
            helper(root.left,ln);
            helper(root.right,ln);
            ln.add(root.val);
        }
        
    }
