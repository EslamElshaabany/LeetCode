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
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}

// solution 1: 
// change every visited node value to Integer.MAX_VALUE
// if you reached null return false 
// if the current value is Integer.MAX_VALUE return true

// solution 2: using map
// assuming the every node has unique hash even with the same value
// insert every node in the map 
// if the node exist before return true 
// return false

// solution 3: fast-slow pointer