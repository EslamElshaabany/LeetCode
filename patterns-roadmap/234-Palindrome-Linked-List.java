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

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int size = 0, i = 0;
        ListNode tail = head;
        while (tail != null) {
            size++;
            tail = tail.next;
        }
        boolean isOdd = size % 2 != 0 ? true : false;

        if (size == 1)
            return true;

        while (i < size / 2) {
            stack.push(head.val);
            i++;
            head = head.next;
        }

        if (isOdd) {
            i++;
            head = head.next;
        };

        while (head != null) {

            if (!stack.isEmpty() && stack.peek() == head.val) {
                stack.pop();
            } else {
                return false;
            }
            i++;
            head = head.next;
        }

        return stack.isEmpty();
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