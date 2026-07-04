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
    public boolean isPalindrome(ListNode head) {

        int size = 0, i = 0;
        ListNode tail = head;
        while (tail != null) {
            size++;
            tail = tail.next;
        }
        boolean isOdd = size % 2 != 0 ? true : false;

        if (size == 1)  return true;

        ListNode head2 = head;
        while (i < size/2) {
            i++;
            head2 = head2.next;
        }
        if (isOdd) {
            i++;
            head2 = head2.next;
        };

        ListNode tail2 = head2, prev = null, next = null;
        while (tail2 != null) {
            next = tail2.next;
            tail2.next = prev;
            prev = tail2;
            tail2 = next;
        }
        head2 = prev;

        while (head != null && head2 != null) {
            if(head.val != head2.val) return false;
            head = head.next;
            head2 = head2.next;
        }

        return true;
    }
}

// solution 1: using stack
// if(stack.peek == head) pop
// else push head
// return stack.isEmpty

// move until the size/2 doing push
// move to the end if the stack.peek == head pop
// else return false
// return stack.isEmpty


// solution 2: reverse the second half
// [1,2,2,1]
// [1,2,1,2]
// skipping the middle in odd sizes
// [1,2,3,4,3,2,1]
// [1,2,3,4,1,2,3]