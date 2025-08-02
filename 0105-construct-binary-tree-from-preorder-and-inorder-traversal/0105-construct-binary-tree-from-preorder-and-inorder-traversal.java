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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> hs  = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            hs.put(inorder[i],i);
        }

        return splitTree(preorder, hs, 0,0,inorder.length-1);

    }

    public TreeNode splitTree(int[] preorder, Map<Integer,Integer> hs, int rootindex, int left, int right){
        
        TreeNode root = new TreeNode(preorder[rootindex]);
        int mid = hs.get(preorder[rootindex]);
        if(mid>left){
            root.left=splitTree(preorder, hs, rootindex+1, left, mid-1);
        }
        if(mid<right){
            root.right=splitTree(preorder,hs, rootindex+mid-left+1, mid+1, right);
        }
        return root;

    }
}