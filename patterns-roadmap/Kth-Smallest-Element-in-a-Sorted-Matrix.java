1class Solution {
2    public int kthSmallest(int[][] matrix, int k) {
3        PriorityQueue<Integer> maxQueue = new PriorityQueue<>((a,b) -> b-a);
4        for (int[] row : matrix) {
5            for (int val : row) {
6                maxQueue.offer(val);
7                if(maxQueue.size() > k) {
8                    maxQueue.poll();
9                }
10            }
11        }
12        return maxQueue.peek();
13    }
14}