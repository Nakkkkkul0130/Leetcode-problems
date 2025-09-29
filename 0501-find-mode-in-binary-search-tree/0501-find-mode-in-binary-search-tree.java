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
    Integer prev = null;
    int count=0, maxcount=0;
    List<Integer> modes = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        inorder(root);
        int[] arr = new int[modes.size()];
        for(int i=0;i<modes.size();i++){
            arr[i] = modes.get(i);
        }
        return arr;
        
    }
    private void inorder(TreeNode node){
        if(node==null){
            return;
        }
        inorder(node.left);
        if(prev!=null && prev==node.val){
            count+=1;
        }
        else{
            count=1;
            prev = node.val;
        }
        if(count>maxcount){
            maxcount=count;
            modes.clear();
            modes.add(node.val);
        }
        else if(count==maxcount){
            modes.add(node.val);
        }
        inorder(node.right);
        

    }
}