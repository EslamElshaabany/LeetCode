1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
4        for(int num : nums) {
5            minHeap.offer(num);
6            if (minHeap.size() > k) {
7                minHeap.poll();
8            }
9        }
10        return minHeap.peek();
11    }
12}
13
14// solution 1: O(nlogn)
15// sort the array O(nlogn)
16// get the k element on the array o(1)
17
18// solution 2: k time loops O(nk)
19// loop on the array get the largest element < last largest element
20
21// solution 3: periority tree O(nlogn)
22// use min heap limited to size k
23// after all insertions we have the largest numbers in the heap
24// the head of the heap is the k largest element
25