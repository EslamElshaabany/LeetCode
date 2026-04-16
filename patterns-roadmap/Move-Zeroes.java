1class Solution {
2    public void moveZeroes(int[] nums) {
3
4
5        int lastInsertIndex = 0;
6
7        for(int i =0; i< nums.length; i++) {
8            if(nums[i] != 0) {
9                nums[lastInsertIndex] = nums[i];
10                lastInsertIndex++;
11            }
12        }
13
14        while(lastInsertIndex < nums.length) {
15            nums[lastInsertIndex++] = 0;
16        }
17    }
18}
19
20
21