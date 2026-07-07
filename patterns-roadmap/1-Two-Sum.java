class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> indeces = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            indeces.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++) {
            int complement = target-nums[i];
            if(indeces.containsKey(complement)&& indeces.get(complement) != i) {
                return new int[]{i,indeces.get(complement) };
            }
        }

        return new int[]{-1, -1};
    }
}

// solution 1: brute force O(n^2)
// for every elemnt try it with all the next array elemnts
// if the sum is the target return the indeces imeddiatly
// if finish with no return return dummy indeces

// solution 2: using map O(n)
// insert all elements in a map with values as key and indeces as values
// for every element in the array find the complement in the map 
// if exisits return indeces