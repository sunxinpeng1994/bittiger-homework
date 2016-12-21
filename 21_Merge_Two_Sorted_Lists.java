/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //corner case
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        
        //core logic
        ListNode newHead;
        if(l1.val < l2.val){
            newHead = l1;
            newHead.next = mergeTwoLists(l1.next, l2);
        }
        else{
            newHead = l2;
            newHead.next = mergeTwoLists(l1, l2.next);
        }
        return newHead;
    }
}