1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode mergeKLists(ListNode[] lists) {
13 if (lists == null || lists.length == 0) return null;
14
15        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);
16
17        for (ListNode node : lists) {
18            if (node != null) {
19                minHeap.offer(node);
20            }
21        }
22
23        ListNode dummy = new ListNode(-1);
24        ListNode tail = dummy;
25
26        while (!minHeap.isEmpty()) {
27            ListNode smallest = minHeap.poll();
28            tail.next = smallest;
29            tail = smallest;
30            if (smallest.next != null) {
31                minHeap.offer(smallest.next);
32            }
33        }
34
35        return dummy.next;
36    }
37}
38
39// insert in min heap
40// poll the heap to get the next element in the list