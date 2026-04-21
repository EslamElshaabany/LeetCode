1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3
4        int numsSize = nums.length;
5
6        double bestSum = 0.0;
7        for (int i = 0; i < k; i++) {
8            bestSum += nums[i];  
9        }
10        
11        double currentWindow = bestSum;
12        for (int i = k; i < numsSize; i++) {
13            currentWindow += nums[i] - nums[i-k];
14            bestSum = Math.max(currentWindow, bestSum);
15        }
16        
17        return bestSum / k;
18    }
19}
20
21// solution 1: o(n)
22// loop on the array 
23// add the current elemnt to sum array
24// start form k as i and calc sum of k as sum[i] - sum[i-k]
25// return max sum / k
26
27//[1,13,8,2,52,55]
28// 2
29// 51
30// 42
31