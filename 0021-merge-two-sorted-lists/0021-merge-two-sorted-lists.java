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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode s = new ListNode(0);
        ListNode f = s;
        // if(list1==null){
        //     return list2;
        // }
        // else{
        //     return list1;
        // }
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                f.next=list1;
                list1=list1.next;
            }
            else{
                f.next=list2;
                list2=list2.next;
            }
            f=f.next;
        }
        if(list1!=null){
            f.next=list1;
        }
        else{
            f.next=list2;
        }
        return s.next;

    }
}