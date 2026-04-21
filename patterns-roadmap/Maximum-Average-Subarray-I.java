1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3
4        int numsSize = nums.length;
5
6        Double bestSum = 0.0;
7        for (int i = 0; i < k; i++) {
8            bestSum += nums[i];  
9        }
10        Double currentWindow = bestSum;
11        for (int i = k; i < numsSize; i++) {
12            currentWindow += nums[i] - nums[i-k];
13            bestSum =  Double.compare(currentWindow, bestSum) > 0 ? currentWindow : bestSum;
14        }
15        
16        return bestSum / k;
17    }
18}
19
20// solution 1: o(n)
21// loop on the array 
22// add the current elemnt to sum array
23// start form k as i and calc sum of k as sum[i] - sum[i-k]
24// return max sum / k
25
26//[1,13,8,2,52,55]
27// 2
28// 51
29// 42
30