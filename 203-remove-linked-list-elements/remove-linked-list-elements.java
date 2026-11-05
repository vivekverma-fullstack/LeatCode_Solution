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
    public ListNode removeElements(ListNode head, int val) {
        // Dummy node acts as a fake head node before the actual head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode curr = dummy;
        
        while (curr.next != null) {
            if (curr.next.val == val) {
                // Skip the matching node
                curr.next = curr.next.next;
            } else {
                // Advance pointer only when no node is removed
                curr = curr.next;
            }
        }
        
        return dummy.next;
    }
}