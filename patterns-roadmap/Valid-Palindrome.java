1class Solution {
2    public boolean isPalindrome(String s) {
3
4        Deque<Character> stack = new ArrayDeque<>();
5
6        String ss = sanitize(s);
7
8        for (char c : ss.toCharArray()) {
9            stack.push(c);
10        }
11
12        for (char c : ss.toCharArray()) {
13            if (stack.pop() != c) {
14                return false;
15            }
16        }
17
18        return true;
19    }
20
21    static String sanitize(String s) {
22        StringBuilder sb = new StringBuilder();
23        for (char c : s.toCharArray()) {
24            if (Character.isLetterOrDigit(c)) {
25                sb.append(Character.toLowerCase(c));
26            }
27        }
28        return sb.toString();
29    }
30}
31
32// solution 1: using stack o(n)
33// santize the string: convert to lowercase, remove all the non-alpha
34// insert it into stack
35// loop on stack and string pop and compare if != return fale
36// return true