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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode head;
        if(list1.val < list2.val) {
            head = list1;
            list1.next = mergeTwoLists(list1.next, list2);
        } else {
            head = list2;
            list2.next = mergeTwoLists(list1, list2.next);
        }
        return head;
    }
}

// solution 1: iterative 
// use dummy node and tail = dummy
// while lis1 and list2 ! null
    // tail = min(list1, list2) // list1.next || list2.next
    // tail = tail.next
// tail.next = the rest of list1 || list2
// return dummy.next

// solution 2: recursive
// if(list1 == null) return list2;
// if(list2 == null) return list1;
// ListNode tmp;
// if (list1.val < list2.val)
    // tmp = list1
    // list1.next = merge(list1.next, list2)
// else 
    // tmp = list2
    // list2.next =  merge(list1, list2.next)
// return tmp
