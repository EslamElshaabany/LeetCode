1class Solution {
2    public void moveZeroes(int[] nums) {
3
4
5        int lastInsertIndex = 0;
6
7        for(int i =0; i< nums.length; i++) {
8            if(nums[i] != 0) {
9                int tmp = nums[lastInsertIndex];
10                nums[lastInsertIndex] = nums[i];
11                nums[i] = tmp;
12                lastInsertIndex++;
13            }
14        }
15
16        // while(lastInsertIndex < nums.length) {
17        //     nums[lastInsertIndex++] = 0;
18        // }
19    }
20}
21
22
23