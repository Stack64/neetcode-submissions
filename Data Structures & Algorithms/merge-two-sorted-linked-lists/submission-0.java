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
        ListNode df=new ListNode(0);
        ListNode kk=df;

        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                kk.next=list1;
                list1=list1.next;
            }else{
                kk.next=list2;
                list2=list2.next;
            }
            kk=kk.next;
        }  
        if(list1!=null) kk.next=list1;
        if(list2!=null) kk.next=list2;
        return df.next;
    }
}