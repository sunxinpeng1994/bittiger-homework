138_copy_list_with_random_pointer.java
/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        //corner case
        if(head == null){
            return head;
        }
        //core logic
        Map<RandomListNode,RandomListNode> map = new HashMap<RandomListNode,RandomListNode>();
        RandomListNode temp = head;
        while(temp != null){
            map.put(temp, new RandomListNode(temp.label));
            temp = temp.next;
        }
        
        temp = head;
        while(temp != null){
            map.get(temp).next = map.get(temp.next);
            map.get(temp).random = map.get(temp.random);
            temp = temp.next;
        }
        return map.get(head);
    }
}