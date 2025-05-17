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
    public long kthLargestLevelSum(TreeNode root, int k) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<Long> levelSums = new ArrayList<>();
        while(!q.isEmpty()){
            int n = q.size();
            long sum=0;
            for(int i=0;i<n;i++){
                TreeNode rem = q.poll();
                sum+=rem.val;
                if(rem.left!=null){
                    q.add(rem.left);
                }
                if(rem.right!=null){
                    q.add(rem.right);
                }
            }
            levelSums.add(sum);
        }
        if(k>levelSums.size()){
            return -1;

        }
        Collections.sort(levelSums, Collections.reverseOrder());
        return levelSums.get(k - 1);
    }
}