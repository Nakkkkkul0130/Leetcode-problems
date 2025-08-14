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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<>();
        helper(root, al);
        return al;
    }
    public TreeNode helper(TreeNode node, List<Integer> al){
        if(node==null){
            return null;
        }
        TreeNode left = helper(node.left, al);
        al.add(node.val);
        TreeNode right = helper(node.right, al);
        return node;
    }
}