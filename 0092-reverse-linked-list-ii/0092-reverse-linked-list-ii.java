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
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode prev = dummy;
        for(int i=1;i<left;i++){
            prev=prev.next;
        }
        ListNode curr = prev.next;
        ListNode rh=null;
        for(int i=0;i<right-left+1;i++){
            ListNode temp=curr;
            curr=curr.next;
            temp.next=rh;
            rh=temp;
        }
        ListNode tail = prev.next;
        prev.next=rh;
        tail.next=curr;
        return dummy.next;
    }

    
}