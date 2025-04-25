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
public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>(); 
        List<Integer> currentPath = new ArrayList<>();  
        findPaths(root, targetSum, currentPath, result);
        return result;
    }

    private void findPaths(TreeNode node, int targetSum, List<Integer> currentPath, List<List<Integer>> result) {
        if (node == null) {
            return; 
        }

        currentPath.add(node.val);
        targetSum -= node.val;

        if (node.left == null && node.right == null && targetSum == 0) {
            result.add(new ArrayList<>(currentPath));  
        }

        findPaths(node.left, targetSum, currentPath, result); 
        findPaths(node.right, targetSum, currentPath, result);

        currentPath.remove(currentPath.size() - 1);
    }
}
