1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        String ss = new String(t);
4        for(char c: s.toCharArray()) {
5            int cIndex = ss.indexOf(c);
6            if (cIndex == -1) {
7                return false;
8            } else {
9                ss = ss.substring(cIndex+1, ss.length());
10            }
11        }
12        return true;
13    }
14}
15
16// for every element in s 
17// find it in t after this update the search sting to 
18// be the substring after it
19
20// two pointers