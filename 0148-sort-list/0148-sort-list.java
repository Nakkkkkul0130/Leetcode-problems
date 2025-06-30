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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        List<Integer> res = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null){
            res.add(curr.val);
            curr=curr.next;
        }
        int[] arr = new int[res.size()];
        for(int i=0;i<res.size();i++){
            arr[i] = res.get(i);
        }
        Arrays.sort(arr);

        ListNode dummy = new ListNode(0);
        ListNode dummy1 = dummy;
        for(int num : arr){
            dummy1.next = new ListNode(num);
            dummy1=dummy1.next;
        }
        return dummy.next;
    }
}