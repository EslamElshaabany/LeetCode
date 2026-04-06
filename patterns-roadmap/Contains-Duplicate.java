1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3
4        Set<Integer> set = new HashSet<>();
5        for (int x : nums) {
6            set.add(x);
7        }
8        return set.size() != nums.length; 
9    }
10}
11
12
13// flag 
14
15
16// sol 1: sort the loop to compare two numbers o(nlogn)
17// sol 2: insert the array in a set return the len comparision o(n)
18// sol 3: two nest loops to compare every compination o(n^2)