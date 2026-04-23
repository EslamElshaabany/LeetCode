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
12    public ListNode reverseList(ListNode head) {
13
14        return reverse(head, null);
15
16    }
17
18    private static ListNode reverse(ListNode current, ListNode prev) {
19        if (current == null)  return prev; 
20        ListNode next = current.next;
21        current.next = prev;
22        return reverse(next, current); 
23    }
24
25}
26
27// at the start listnode is the head
28// next = null, prev = null
29// loop while listnode.next == null
30    // next = listnode.next
31    // listnode.next = prev
32    // prev = listnode
33    // listnode = next
34
35
36// reverse(ListNode current, ListNode prev = null)
37// base case current.next == null return current
38// next = current.next;
39// current.next = prev;
40// prev = current;
41// recursive case = return reverse(current.next) 
42