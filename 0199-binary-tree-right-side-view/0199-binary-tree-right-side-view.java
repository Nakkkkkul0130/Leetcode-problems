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
    public List<Integer> rightSideView(TreeNode root) {
       Queue<TreeNode> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            for(int i=1;i<=n;i++){
                TreeNode rem = q.poll();
                if(i==n){
                list.add(rem.val);
                }
                if(rem.left!=null){
                    q.add(rem.left);
                }
                if(rem.right!=null){
                    q.add(rem.right);
                }
            }
        }
        return list;
    }
}