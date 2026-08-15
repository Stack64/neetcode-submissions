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
    public ListNode reverseKGroup(ListNode head, int k) {
        ArrayList<ListNode> ll=new ArrayList<>();
        for(ListNode curr=head;curr!=null;curr=curr.next) ll.add(curr);
        for(int i=0;i+k<=ll.size();i+=k){
            int l=i;
            int r=i+k-1;
            while(l<r){
                ListNode tmp=ll.get(l);
                ll.set(l,ll.get(r));
                ll.set(r,tmp);
                l++;
                r--;
            }
        }
        for(int i=0;i<ll.size()-1;i++){
            ll.get(i).next=ll.get(i+1);
        }
        ll.get(ll.size()-1).next=null;
        return ll.isEmpty() ? null : ll.get(0);
    }
}
