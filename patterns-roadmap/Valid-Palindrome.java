1class Solution {
2    public boolean isPalindrome(String s) {
3
4        String ss = sanitize(s);
5
6        int start = 0, end = ss.length() - 1;
7
8        while (end >= start) {
9            if (ss.charAt(start++) != ss.charAt(end--)) {
10                return false;
11            }
12        }
13
14        return true;
15    }
16
17    static String sanitize(String s) {
18        StringBuilder sb = new StringBuilder();
19        for (char c : s.toCharArray()) {
20            if (Character.isLetterOrDigit(c)) {
21                sb.append(Character.toLowerCase(c));
22            }
23        }
24        return sb.toString();
25    }
26}
27
28// solution 1: using stack o(n)
29// sanitize the string: convert to lowercase, remove all the non-alpha
30// insert it into stack
31// loop on stack and string pop and compare if != return fale
32// return true
33
34// solution 2: two pointers
35// sanitize the string and iterate on it with two pointers: start & end
36// if start != end return false