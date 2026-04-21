1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3
4        int numsSize = nums.length;
5
6        int[] sumNums = new int[numsSize];
7
8        for (int i = 0; i < numsSize; i++) {
9            if(i == 0) sumNums[i] = nums[i];
10            else sumNums[i] = sumNums[i-1] + nums[i];    
11        }
12
13        double maxSum = Double.NEGATIVE_INFINITY, currentSum = 0;
14
15        for (int i = k - 1; i < numsSize; i++) {
16            if (i == k - 1) currentSum = sumNums[i];
17            else currentSum = sumNums[i] - sumNums[i-k];
18            maxSum =  Double.compare(currentSum, maxSum) > 0 ? currentSum : maxSum;
19        }
20        
21        return maxSum / k;
22    }
23}
24
25// loop on the array 
26// add the current elemnt to sum array
27// 
28
29//[1,13,8,2,52,55]
30// 2
31// 51
32// 42
33