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
        Set<ListNode> listMap = new HashSet<>();
        while(head != null) {
            if (listMap.contains(head)) return true;
            listMap.add(head);
            head = head.next;
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