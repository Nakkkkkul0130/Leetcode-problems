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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> sortedvalues = new ArrayList<>();
        inorder(root, sortedvalues);
        return balancedTree(sortedvalues, 0, sortedvalues.size()-1);
        
    }
    private void inorder(TreeNode root, List<Integer> al){
        if(root==null){
            return;
        }
        inorder(root.left,al);
        al.add(root.val);
        inorder(root.right,al);
    }
    private TreeNode balancedTree(List<Integer> al, int start,int end){
        if(start>end){
            return null;
        }
        int mid = start+(end-start)/2;
        TreeNode node = new TreeNode(al.get(mid));
        node.left = balancedTree(al,start,mid-1);
        node.right = balancedTree(al,mid+1,end);
        return node;
    }

}