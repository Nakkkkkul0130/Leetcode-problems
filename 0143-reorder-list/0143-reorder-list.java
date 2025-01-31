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
    public void reorderList(ListNode head) {
        if(head==null){
            return;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode i = slow.next;
        slow.next=null;
        ListNode rh = null;
        while(i!=null){
            ListNode temp=i;
            i=i.next;
            temp.next=rh;
            rh=temp;
        }
        ListNode first= head, second=rh;
        while(second!=null){
            ListNode temp1=first.next, temp2=second.next;
            first.next=second;
            second.next=temp1;
            first=temp1;
            second=temp2;
        }
         


    }
}