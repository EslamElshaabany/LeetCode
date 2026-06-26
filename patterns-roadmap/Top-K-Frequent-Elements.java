1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        Map<Integer, Integer> freqMap = new HashMap<>();
4        for (int num : nums) {
5            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
6        }
7
8        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
9
10        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
11            minHeap.offer(entry);
12            if(minHeap.size() > k) {
13                minHeap.poll();
14            }
15        }
16
17        int[] result = new int[k];
18        for (int i = 0; i < k; i++) {
19            result[i] = minHeap.poll().getKey();
20        }
21        return result;
22    }
23}
24
25// solution 1: using frequency map O(nlogn)
26// insert elements into map with key = element, value = frequency O(n)
27// sort the map by value O(nlogn)
28// return the k top keys 
29
30// solution 2: using min heap O(nlogk)
31// the priority queue of size k should have the most frequent elements
32// insert elements into map with key = element, value = frequency O(n)
33// insert the map entries in a periority queue of size k
34// if the size of the queue > k poll
35