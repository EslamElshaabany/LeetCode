1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3  
4        List<Integer> arr = new ArrayList<>();
5
6        for(int i = 1; i <= nums.length; i++) {
7            if (num[i] == -1) continue;
8            else {
9                int index = nums[i] -1;
10                nums[index] = -1;
11            }
12        }
13
14        for(int i = 1; i <= nums.length; i++) {
15            if (nums[i] != -1) {
16                arr.add(i+1);
17            }
18        }
19
20        return arr;
21    }
22}
23
24// loop on the array if got to current value index and mark it with -1
25// if (arr[i] == -1) continue
26// else index = arr[i]-1 arr[index] = -1 
27
28
29// loop on the array 2 times
30// swap every element to it's corret index swap(val=arr[i], arr[val-1])
31// 
32
33
34// burte force 
35// set
36// loop on the array and set.put(arr[i], 1) o(n)
37// loop for 1 .. n if set ! contains(i) add to results o (n)
38// return results 
39
40//first iteration
41//[1,2,3,4,5,6,7,8]
42//-----------------
43//[4,3,2,7,8,2,3,1]0
44//[7,3,2,4,8,2,3,1]1
45//[7,2,3,4,8,2,3,1]2
46//[7,2,3,4,8,2,3,1]3
47//[7,2,3,4,8,2,3,1]4
48//[7,2,3,4,1,2,3,8]5
49//[7,2,3,4,1,2,3,8]6
50//[7,2,3,4,1,2,3,8]7
51//[7,2,3,4,1,2,3,8]8
52//-----------------
53//[7,2,3,4,1,2,3,8]0
54//[3,2,3,4,1,2,7,8]1
55//[3,2,3,4,1,2,7,8]2
56//[3,2,3,4,1,2,7,8]3
57//[3,2,3,4,1,2,7,8]4
58//[1,2,3,4,3,2,7,8]5
59//[1,2,3,4,3,2,7,8]6
60//[1,2,3,4,3,2,7,8]7
61//[1,2,3,4,3,2,7,8]8
62
63
64