1class Solution {
2    public int maxProfit(int[] prices) {
3
4        final int SIZE = prices.length;
5        for (int i = 0; i < SIZE; i++) {
6            if (i == SIZE-1) prices[i] = 0;
7            else prices[i] = prices[i+1] - prices[i];
8        }
9
10        int maxProf = 0, currProf = 0;
11
12        for (int i = 0; i < SIZE; i++) {
13            currProf += prices[i];
14            maxProf = Math.max(maxProf, currProf);
15            currProf = Math.max(currProf, 0);
16        }
17
18        return maxProf;
19    }
20}
21
22// solution 1: bruteforce o(n^2) TLE
23// for ever element 
24// loop on every element in next array
25// update maxProf 
26// return max Prof
27
28// solution 2: two pointers o(n)
29// one pointer to track the min buy price (slow)
30// other pointer update best profet (fast)
31
32// solution 3: sliding window o(n)
33// covert the array to tomorrow - today diff
34// find the max profit by summing diffs rest max if sum < 0