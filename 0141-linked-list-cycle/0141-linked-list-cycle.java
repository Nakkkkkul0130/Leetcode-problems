/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        boolean iscycle = false;
        ListNode s = head;
        ListNode f = head;
        while(f!=null && f.next!=null && f.next.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){
            iscycle=true;
            break;
        }
        }
        return iscycle;
    }
}