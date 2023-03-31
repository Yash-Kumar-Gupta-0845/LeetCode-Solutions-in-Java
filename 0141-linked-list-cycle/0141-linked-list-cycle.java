/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode left = head; 
        ListNode right = head;
        while(right != null && right.next!= null){
            left=left.next;
            right = right.next.next;
            if (right == left)
                return true;
        }
        return false;
    }
}