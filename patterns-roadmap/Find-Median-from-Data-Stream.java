1class MedianFinder {
2
3    // maxHeap holds the smaller half, minHeap holds the larger half
4    // invariant: maxHeap.size() == minHeap.size() or maxHeap.size() == minHeap.size() + 1
5    private final PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
6    private final PriorityQueue<Integer> minHeap = new PriorityQueue<>();
7
8    public MedianFinder() {}
9
10    public void addNum(int num) {
11        if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
12            maxHeap.offer(num);
13        } else {
14            minHeap.offer(num);
15        }
16
17        // rebalance so sizes never differ by more than 1
18        if (maxHeap.size() > minHeap.size() + 1) {
19            minHeap.offer(maxHeap.poll());
20        } else if (minHeap.size() > maxHeap.size()) {
21            maxHeap.offer(minHeap.poll());
22        }
23    }
24
25    public double findMedian() {
26        if (maxHeap.size() > minHeap.size()) {
27            return maxHeap.peek();
28        }
29        return (maxHeap.peek() + minHeap.peek()) / 2.0;
30    }
31}