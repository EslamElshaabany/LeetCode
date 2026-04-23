1class Solution {
2    public int maxProfit(int[] prices) {
3        int maxProf = 0, minPrice = prices[0];
4
5        for (int i = 0; i < prices.length; i++) {
6            minPrice = prices[i] < minPrice ? prices[i] : minPrice;
7            int prof = prices[i] - minPrice;
8            maxProf = prof > maxProf ? prof : maxProf;
9        }
10
11        return maxProf;
12    }
13}
14
15
16// solution 1: bruteforce o(n^2)
17// for ever element 
18// loop on every element in next array
19// update maxProf 
20// return max Prof
21
22//