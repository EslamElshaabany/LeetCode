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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode slow = head, fast = head;

        while(fast != null) {
            if (slow.val != fast.val) {
                slow.next = fast;
                slow = slow.next;
            }
            fast = fast.next;
        }
        if(slow != null) slow.next = null;

        return head;
    }
}

// using fast slow pointers
// slow pointer track current element
// the fast find the next uniqe
// if fast != solw
// slow.next = fast
// slow = slow.next