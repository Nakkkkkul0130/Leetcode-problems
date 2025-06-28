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
    private ListNode current;
    public TreeNode sortedListToBST(ListNode head) {
        // int size = getlen(head);
        // current = head;

        List<Integer> al = new ArrayList<>();
        while(head!=null){
            al.add(head.val);
            head=head.next;
        }
        return buildbst(al, 0, al.size()-1);
        
    }
    // private int getlen(ListNode head){
    //     int count=0;
    //     while(head!=null){
    //         count++;
    //         head=head.next;
    //     }
    //     return count;
    // }
    private TreeNode buildbst(List<Integer> al, int left, int right){
        if(left>right){
            return null;
        }
        int mid = left+(right-left)/2;
        // TreeNode leftchild = buildbst(left, mid-1);

        TreeNode root = new TreeNode(al.get(mid));
        // current=current.next;

        // TreeNode rightchild = buildbst(mid+1, right);

        // root.left = leftchild;
        // root.right = rightchild;
        root.left = buildbst(al,left,mid-1);
        root.right = buildbst(al,mid+1,right);
        return root;
    }
}