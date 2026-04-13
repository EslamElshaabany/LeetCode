1class Solution {
2    public int missingNumber(int[] nums) {
3        
4        int sum = 0;
5        for(int i = 0; i < nums.length; i++) {
6            sum += nums[i];
7        }
8        int n = nums.length;
9        
10        return (n*(n+1)/2) - sum;
11    }
12}