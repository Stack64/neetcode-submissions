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
    public ListNode reverseList(ListNode head) {
        ListNode curr=head,prev=null;
        while(curr!=null){
            //Save the Next Node
            ListNode next=curr.next;

            // Reverse the Pointer
            curr.next=prev;

            // Move Prev to Curr
            prev=curr;

            // Move Curr to Temp
            curr=next;

        }
        return prev;
    }
}
