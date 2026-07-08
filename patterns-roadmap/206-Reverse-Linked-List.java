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
    ListNode reverse(ListNode head, ListNode prev) {
        if (head == null) return prev;
        ListNode next = head.next;
        head.next = prev;
        return reverse(next, head);
    }

    public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }
}

// reverse linkedlist
// if head next is null return null
// next = head next
// head next  = prev
// prev = head 