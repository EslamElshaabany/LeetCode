1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3     
4        Set<Integer> set = new HashSet<>();
5
6        for(int num : nums) {
7            set.add(num);
8        }
9
10        List<Integer> arr = new ArrayList<>();
11
12        for(int i = 1; i <= nums.length; i++) {
13            if(!set.contains(i)) {
14                arr.add(i);
15            }
16        }
17
18        return arr;
19    }
20}
21
22
23// burte force 
24// set
25// loop on the array and set.put(arr[i], 1) o(n)
26// loop for 1 .. n if set ! contains(i) add to results o (n)
27// return results 