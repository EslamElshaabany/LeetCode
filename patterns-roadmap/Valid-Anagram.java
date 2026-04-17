1class Solution {
2    public boolean isAnagram(String s, String t) {
3
4        Map<Character, Integer> sMap = new HashMap<>();
5        Map<Character, Integer> tMap = new HashMap<>();
6
7        for(char sChar: s.toCharArray()) {
8            sMap.put(sChar, sMap.getOrDefault(sChar, 0) + 1);
9        }
10
11        for(char tChar: t.toCharArray()) {
12            tMap.put(tChar, tMap.getOrDefault(tChar, 0) + 1);
13        }
14
15        return sMap.equals(tMap);
16    }
17}
18
19// solution 1: sorting o(nlogn)
20// - convet to char array o(n)
21// - sort the array o(nlogn)
22// - new string form array o(n)
23// - compare the strings o(n)
24
25// solution 2: map !o(o)
26// insert elments in map o(n)
27// compare maps o(n)
28