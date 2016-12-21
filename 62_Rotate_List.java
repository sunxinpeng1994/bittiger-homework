/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        //corner case
        if(head == null || k == 0){
            return head;
        }
        if(head.next == null){
            return head;
        }
        
        //core logic
        int i = 0;
        ListNode cur = head;
        //get the length of linkedlist
        while(cur != null){
            i++;
            cur = cur.next;
        }
        int listlength = i;
        k = k%listlength;
        cur = head;
        int j = 0;
        //make sure that the final node's next node is the original head node
        while(j <= listlength){
            j++;
            if(j == listlength){
                cur.next = head;
            }
            cur = cur.next;
        }
        //define the new head node
        cur = head;
        j = 0;
        while(j <= listlength){
            j++;
            if(j == listlength - k + 1){
                head = cur;
                break;
            }
            cur = cur.next;
        }
        //define the new last node
        cur = head;
        j = 0;
        while(j <= listlength){
            j++;
            if(j == listlength){
                cur.next = null;
                break;
            }
            cur = cur.next;
        }
        return head;
    }
}