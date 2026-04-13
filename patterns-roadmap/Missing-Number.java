1class Solution {
2    public int missingNumber(int[] nums) {
3        
4        int sum = nums[0];
5        for(int i = 1; i < nums.length; i++) {
6            sum ^= nums[i];
7        }
8
9        int real = 0;
10        for(int i = 0; i <= nums.length; i++) {
11            real ^= i;
12        }
13
14        return sum ^ real;
15    }
16}