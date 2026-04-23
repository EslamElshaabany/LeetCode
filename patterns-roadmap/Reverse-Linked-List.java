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
14        ListNode next = null, prev = null;
15
16        while (head != null) {
17            if (head.next == null) {
18                head.next = prev;
19                next = null;
20                prev = head;
21                break;
22            }
23            next = head.next;
24            head.next = prev;
25            prev = head;
26            head = next;
27        }
28
29        return head;
30    }
31}
32
33// at the start listnode is the head
34// next = null, prev = null
35// loop while listnode.next == null
36    // next = listnode.next
37    // listnode.next = prev
38    // prev = listnode
39    // listnode = next
40