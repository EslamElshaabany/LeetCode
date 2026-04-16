1class Solution {
2    public int majorityElement(int[] nums) {
3    
4        Map<Integer, Integer> map = new HashMap<>();
5
6        for (int num : nums) {
7            if(map.containsKey(num)) {
8                int val = map.get(num);
9                map.put(num, val+1);
10            } else {
11                map.put(num, 1);
12            }
13        }
14
15        System.out.println(map);
16
17        int majorityValue = 0;
18        int majorityKey = 0;
19
20        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
21            if (entry.getValue() > majorityValue) {
22                majorityKey = entry.getKey();
23                majorityValue = entry.getValue();
24            }
25        }
26
27        return majorityKey;
28
29    }
30}
31
32// loop on array 
33// insert el in map as key with 1 or increment value if exists
34// loop on the map and get the element with the highest value