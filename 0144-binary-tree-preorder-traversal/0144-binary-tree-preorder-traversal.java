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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ln = new ArrayList<>();
        helper(root,ln);
        return ln;
    }
        private void helper(TreeNode root, List<Integer> ln){
            if(root==null){
                return;
            }
            ln.add(root.val);
            helper(root.left, ln);
            helper(root.right,ln);
        }
    }
