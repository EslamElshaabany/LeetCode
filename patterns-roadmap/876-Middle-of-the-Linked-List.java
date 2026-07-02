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
    public ListNode middleNode(ListNode head) {

        ListNode fast = head, slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}

// solution 1: arraylist O(n)
// insert every element in the linked list into arraylist
// return the middle element

// solution 2: slow-fast pointers O(n) better space
// every iteration slow move 1 step, fast move 2 steps
// when fast reaches the end the slow will be at the middle