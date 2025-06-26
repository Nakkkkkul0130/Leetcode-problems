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
    public List<TreeNode> generateTrees(int n) {
        return n==0 ? Collections.emptyList() : construct(1,n);
        
    }
    private List<TreeNode> construct(int min, int max){
        List<TreeNode> trees = new ArrayList<>();
        if(min>max){
            trees.add(null);
            return trees;
        }

        for(int rootval=min;rootval<=max;rootval++){
            List<TreeNode> leftoption = construct(min, rootval-1);
            List<TreeNode> rightoption = construct(rootval+1, max);

            for(TreeNode leftTree : leftoption){
                for(TreeNode rightTree : rightoption){
                    TreeNode curr = new TreeNode(rootval);
                    curr.left=leftTree;
                    curr.right=rightTree;
                    trees.add(curr);
                }
            }

        }
        return trees;
    }
}