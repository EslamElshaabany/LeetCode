1class Solution {
2    public boolean isPalindrome(String s) {
3
4        Stack<Character> stack = new Stack<>();
5
6        String ss = santize(s);
7
8        for (char c : ss.toCharArray()) {
9            stack.push(c);
10        }
11
12        for (char c : ss.toCharArray()) {
13            if(stack.pop() != c) return false;
14        }
15
16        return true;
17    }
18
19    static String santize(String s) {
20        StringBuilder sb = new StringBuilder();
21        for(char c : s.toCharArray()) {
22            if (Character.isLetterOrDigit(c)) {
23                sb.append(Character.toLowerCase(c));
24            }
25        }
26        return sb.toString();
27    }
28}
29
30// solution 1: using stack o(n)
31// santize the string: convert to lowercase, remove all the non-alpha
32// insert it into stack
33// loop on stack and string pop and compare if != return fale
34// return true