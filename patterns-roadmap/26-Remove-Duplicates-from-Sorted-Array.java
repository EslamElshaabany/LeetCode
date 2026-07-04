class Solution {
    public int removeDuplicates(int[] nums) {
        int curr = 0;
        for(int next = 1; next < nums.length; next++) {
            if (nums[next] != nums[curr]) {
                nums[curr+1] = nums[next];
                curr++;
            }
        }
        return curr+1;
    }
}

// the array is sorted 
// using two pointers 
// one for the current element 
// the other search for the next element
// if the next != current insert next after current
