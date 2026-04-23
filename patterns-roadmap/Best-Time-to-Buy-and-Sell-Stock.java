1class Solution {
2    public int maxProfit(int[] prices) {
3        int maxProf = 0, minPrice = prices[0];
4
5        for (int i = 0; i < prices.length; i++) {
6            minPrice = Math.min(prices[i], minPrice);
7            maxProf = Math.max(prices[i] - minPrice, maxProf);
8        }
9
10        return maxProf;
11    }
12}
13
14// solution 1: bruteforce o(n^2) TLE
15// for ever element 
16// loop on every element in next array
17// update maxProf 
18// return max Prof
19
20// solution 2: two pointers o(n)
21// one pointer to track the min buy price (slow)
22// other pointer update best profet (fast)
23
24// solution 3: sliding window
25// covert the array to tomorro - today diff
26// find the max profit by summing diffs rest max if sum < 0