1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3  
4        List<Integer> arr = new ArrayList<>();
5
6        for(int i = 0; i < nums.length; i++) {
7            int index = Math.abs(nums[i]) - 1;
8            if(nums[index] > 0) nums[index] *= -1;
9        }
10
11        for(int i = 0; i < nums.length; i++) {
12            if(nums[i] > 0) {
13                arr.add(i+1);
14            }
15        }
16
17        return arr;
18    }
19}
20
21// Since values are 1 to n, use each value as an index to mark which numbers are present. The unmarked positions are the missing numbers.
22
23// [-4,-3,-2,-7,8,2,-3,-1]
24
25
26
27// loop on the array if got to current value index and mark it with -1
28// if (arr[i] == -1) continue
29// else index = arr[i]-1 arr[index] = -1 
30
31
32// loop on the array 2 times
33// swap every element to it's corret index swap(val=arr[i], arr[val-1])
34// 
35
36
37// burte force 
38// set
39// loop on the array and set.put(arr[i], 1) o(n)
40// loop for 1 .. n if set ! contains(i) add to results o (n)
41// return results 
42
43//first iteration
44//[1,2,3,4,5,6,7,8]
45//-----------------
46//[4,3,2,7,8,2,3,1]0
47//[7,3,2,4,8,2,3,1]1
48//[7,2,3,4,8,2,3,1]2
49//[7,2,3,4,8,2,3,1]3
50//[7,2,3,4,8,2,3,1]4
51//[7,2,3,4,1,2,3,8]5
52//[7,2,3,4,1,2,3,8]6
53//[7,2,3,4,1,2,3,8]7
54//[7,2,3,4,1,2,3,8]8
55//-----------------
56//[7,2,3,4,1,2,3,8]0
57//[3,2,3,4,1,2,7,8]1
58//[3,2,3,4,1,2,7,8]2
59//[3,2,3,4,1,2,7,8]3
60//[3,2,3,4,1,2,7,8]4
61//[1,2,3,4,3,2,7,8]5
62//[1,2,3,4,3,2,7,8]6
63//[1,2,3,4,3,2,7,8]7
64//[1,2,3,4,3,2,7,8]8
65
66
67