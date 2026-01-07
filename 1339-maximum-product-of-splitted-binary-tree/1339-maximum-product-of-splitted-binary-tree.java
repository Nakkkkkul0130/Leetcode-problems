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
    long total = 0;
    long ans = 0;
    int MOD = 1_000_000_007;
    public int maxProduct(TreeNode root) {
        total = dfs(root);
        maxp(root);
        return (int)(ans%MOD);
    }
    private long dfs(TreeNode root){
        long sum = 0;
        if(root==null){
            return 0;
        }
        long left = dfs(root.left);
        long right = dfs(root.right);
        return root.val+left+right;
    }
    private long maxp(TreeNode root){
        if(root==null){
            return 0;
        }
        long left = maxp(root.left);
        long right = maxp(root.right);

        long subsum = root.val+left+right;
        long prod = subsum * (total-subsum);
        ans = Math.max(ans, prod);

        return subsum;

    }
}