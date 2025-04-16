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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> al = new ArrayList<>();
        while(head!=null){
            al.add(head.val);
            head=head.next;
        }
        int start = 0;
        int end = al.size()-1;
        while(start<end){
            if(!al.get(start).equals(al.get(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}