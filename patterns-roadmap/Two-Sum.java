1import java.util.*;
2
3class Solution {
4    public int[] twoSum(int[] nums, int target) {
5        int n = nums.length;
6
7        // Step 1: store value + index
8        int[][] arr = new int[n][2];
9        for (int i = 0; i < n; i++) {
10            arr[i][0] = nums[i]; // value
11            arr[i][1] = i;       // original index
12        }
13
14        // Step 2: sort by value
15        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
16
17        // Step 3: two pointers
18        int left = 0, right = n - 1;
19
20        while (left < right) {
21            int sum = arr[left][0] + arr[right][0];
22
23            if (sum == target) {
24                return new int[]{arr[left][1], arr[right][1]};
25            } else if (sum < target) {
26                left++;
27            } else {
28                right--;
29            }
30        }
31
32        return new int[]{-1, -1};
33    }
34}
35
36// sol 1: 2 nested loop for each element check with others if they match the target o(n^2)
37// sol 2: sort the array; for each element in the sorted array search for the reminder value in []{n+1, len}