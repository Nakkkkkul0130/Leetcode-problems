/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }
        ListNode s=headA;
        ListNode f=headB;
        while(s!=f){
            s = (s==null)? headB : s.next;
            f = (f==null)? headA : f.next;
        }
        return s;
        
    }
}