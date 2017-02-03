25_reverse_Nodes_in_k-group.java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        //this approach is recursive. reverseKGroup() returns the new head of a part of linkedlist which has k nodes. 
        ListNode cur = head;
        int count = 0;
        while(count != k && cur != null){
            cur = cur.next;
            count++;
        }
        if(count == k){
            ListNode nextNode = reverseKGroup(cur, k);
            while(count > 0){
                ListNode temp = head.next;
                head.next = nextNode;
                nextNode = head;
                head = temp;
                count--;
            }
            return nextNode;
        }
        else{
            return head;
        }
    }
}