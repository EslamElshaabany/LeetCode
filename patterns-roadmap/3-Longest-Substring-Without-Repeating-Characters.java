class Solution {
    public int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> charMap = new HashMap<>();
        int maxLen = 0, currLen = 0;
        int left = 0, right = 0;
        for(int i = 0; i < s.length(); i++) {
            char rightChar = s.charAt(right);
            if (charMap.containsKey(rightChar)) {
                maxLen = maxLen > currLen ? maxLen : currLen;
                int newLeft = charMap.get(rightChar) + 1;
                for(int x = left; x < newLeft; x++) {
                    charMap.remove(s.charAt(x));
                }
                left = newLeft;
                charMap.put(s.charAt(i), i);
                currLen = right - left + 1;
            } else {
                charMap.put(s.charAt(i), i);
                currLen++;
            }
            right++;
        }

        return maxLen > currLen ? maxLen : currLen;
    }
}

// using two pointers and a map of char and index
// left and right
// the left pointer keep in place
// the right pointer moves and check if the current char is in the map
// if not continue and increase the counter
// if exist update the max len
// move the left pointer to the index after it
// reset the counter to the difference of two pointers
// update the char index in the map



// loop on the string with freq map
// if the current element is not in the map continue
// if found
// update the current max
// start over by reseting the map and putting the current element
// this don't solve all the cases 
