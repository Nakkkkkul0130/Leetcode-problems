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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode newNode = head;
        while(newNode!=null && newNode.next!=null){
            if(newNode.val==newNode.next.val){
                newNode.next=newNode.next.next;
            }
            else{
                newNode = newNode.next;
            }
        }
        return head;
        
    }
}