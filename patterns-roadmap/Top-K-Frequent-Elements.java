1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        Map<Integer, Integer> freqMap = new HashMap<>();
4        for (int num : nums) {
5            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
6        }
7
8        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(freqMap.entrySet());
9        entryList.sort((a, b) -> Integer.compare(b.getValue(), a.getValue()));
10
11        int[] result = new int[k];
12        for (int i = 0; i < k; i++) {
13            result[i] = entryList.get(i).getKey();
14        }
15        return result;
16    }
17}
18
19// solution 1: using frequency map O(nlogn)
20// insert elements into map with key = element, value = frequency O(n)
21// sort the map by value O(nlogn)
22// return the k top keys 