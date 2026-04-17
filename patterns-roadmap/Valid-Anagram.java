1class Solution {
2    public boolean isAnagram(String s, String t) {
3
4        char[] sArr = s.toCharArray();
5        char[] tArr = t.toCharArray();
6        
7        Arrays.sort(sArr);
8        Arrays.sort(tArr);
9
10        String sortedS = new String(sArr);
11        String sortedT = new String(tArr);
12
13        return sortedS.equals(sortedT);
14    }
15}