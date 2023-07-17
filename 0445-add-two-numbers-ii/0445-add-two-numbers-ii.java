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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> st1 = new Stack<Integer>();
        while(l1 != null){
            st1.push(l1.val);
            l1 = l1.next;
        }
        Stack <Integer> st2 = new Stack<Integer>();
        while(l2 != null){
            st2.push(l2.val);
            l2 = l2.next;
        }
        int carry = 0;
        ListNode result = null;
        while(!st1.isEmpty() || !st2.isEmpty() || carry != 0){
            int n1 = st1.isEmpty() ? 0: st1.pop();
            int n2 = st2.isEmpty() ? 0: st2.pop();
            int temp = n1+ n2+ carry;
            ListNode result1 = new ListNode(temp % 10);
            result1.next = result;
            result = result1;
            carry = temp / 10;
        }
        return result;
    }
}