/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(root==null){
            return false;
        }
        return dfs(head,root) || isSubPath(head,root.left) || isSubPath(head,root.right);
        
    }
    private boolean dfs(ListNode head, TreeNode node){
        //means we reached end of list,all nodes matched
        if(head==null){
            return true;
        }
        // tree path end, but list hasn't
        if(node==null){
            return false;
        }
        if(head.val!=node.val){
            return false;
        }
        return dfs(head.next,node.left) || dfs(head.next,node.right);
    }
}