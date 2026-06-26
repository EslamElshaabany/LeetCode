1import java.util.AbstractMap;
2import java.util.Map;
3import java.util.PriorityQueue;
4
5class Solution {
6    public int[][] kClosest(int[][] points, int k) {
7        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[2] - a[2]);
8
9        for (int[] p : points) {
10            int dist = p[0] * p[0] + p[1] * p[1];
11            maxHeap.offer(new int[] { p[0], p[1], dist });
12            if (maxHeap.size() > k) {
13                maxHeap.poll();
14            }
15        }
16
17        int[][] result = new int[k][2];
18        for (int i = 0; i < k; i++) {
19            int[] p = maxHeap.poll();
20            result[i] = new int[] { p[0], p[1] };
21        }
22        return result;
23
24    }
25}
26
27// solution 1:
28// for every point calculate the distance and store it in pair of index, distance
29// having max heap of size k
30// insert the pair in the heap keeping it's size
31// return the heap content