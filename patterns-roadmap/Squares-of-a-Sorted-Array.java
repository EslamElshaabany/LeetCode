1// solution 2:
2// loop to square the numbers o(n)
3// after squaring we will have the biggest numbers on start and end
4// loop with two pointers on start and end
5// compare start with end 
6// insert the biggest in the end of a new array
7class Solution {
8    public int[] sortedSquares(int[] nums) {
9
10
11        int size = nums.length;
12        
13        for(int i = 0; i < size; i++) {
14            nums[i] *= nums[i];
15        }
16
17        int left = 0, right = size - 1;
18
19        int[] newNums = new int[size];
20        int lastIndex = size -1;
21
22        while (left <= right) {
23            if(nums[left] > nums[right]) {
24                newNums[lastIndex--] = nums[left++];
25            } else {
26                newNums[lastIndex--] = nums[right--];
27            }
28        }
29        
30        return newNums;
31    }
32}
33
34
35
36// solution 1: 
37// loop to square the numbers o(n)
38// sort the array o(nlogn)
39
40
41// [-4,-1,0,3,10]
42// [16,1,0,9,100]
43
44