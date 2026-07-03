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
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        if (list1 != null) minHeap.offer(list1);
        if (list2 != null) minHeap.offer(list2);

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (!minHeap.isEmpty()) {
            ListNode node = minHeap.poll();
            tail.next = node;
            tail = tail.next;
            if (node.next != null) {
                minHeap.offer(node.next);
            }
        }

        return dummy.next;
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


// solution 2: using min heap
// def dummy and tail = dummy
// add list1 and list2 to heap
// tail.next = heap.poll
// tail= tail.next
// offer tail.next