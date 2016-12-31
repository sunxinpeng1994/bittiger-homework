/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //corner case
        if(l1 == null && l2 != null){
            return l2;
        }
        if(l1 != null && l2 == null){
            return l1;
        }
        if(l1 == null && l2 == null){
            return null;
        }
        //core logic
        int len1 = 0;
        int len2 = 0;
        ListNode dummy = l1;
        //calculate the length of these two LinkedLists
        while(dummy != null){
            len1++;
            dummy = dummy.next;
        }
        dummy = l2;
        while(dummy != null){
            len2++;
            dummy = dummy.next;
        }
        ListNode head = new ListNode(1);
        head.next = len1 < len2 ? helper(l2, l1, len2 - len1) : helper(l1, l2, len1 - len2);
        if(head.next.val>9){
            head.next.val = head.next.val % 10;
            return head;
        }
        return head.next;
    }
    
    public static ListNode helper(ListNode l1, ListNode l2, int offset){
        ListNode head = l1;
        if(l1 == null) {
            return null;
        }else {
            l1.val = (offset == 0) ? (l1.val + l2.val) : l1.val;       
            l1.next = (offset == 0) ? helper(l1.next, l2.next, 0) : helper(l1.next, l2, offset - 1);

            if (l1.next != null && l1.next.val > 9) {
                l1.next.val -= 10;
                l1.val += 1;
            }
            return head;
        }
    }
}