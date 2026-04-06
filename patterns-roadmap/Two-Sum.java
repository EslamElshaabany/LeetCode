1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3
4        int size = nums.length;
5        
6        for (int i = 0; i < size; i++) {
7            for (int j = i + 1; j < size; j++) {
8                if (nums[i] + nums[j] == target) {
9                    return new int[]{i,j};
10                }
11            }
12        }
13        return new int[] {0,0};
14    }
15}
16
17// sol 1: 2 nested loop for each element check with others if they match the target o(n^2)
18// sol 2: sort the array; for each element in the sorted array search for the reminder value in []{n+1, len}