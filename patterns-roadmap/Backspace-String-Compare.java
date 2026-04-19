1class Solution {
2    public boolean backspaceCompare(String s, String t) {
3        
4        Stack<Character> sStack = new Stack<>();
5        Stack<Character> tStack = new Stack<>();
6
7        for (char sChar: s.toCharArray()) {
8            if (sChar == '#') {
9                try {
10                    sStack.pop();
11                } catch(Exception e) {
12                    System.out.println("stack is already empty!");
13                } 
14            } else {
15                sStack.push(sChar);
16            }
17        }
18
19        for (char tChar: t.toCharArray()) {
20            if (tChar == '#') {
21                try {
22                    tStack.pop();
23                } catch(Exception e) {
24                    System.out.println("stack is already empty!");
25                } 
26            } else {
27                tStack.push(tChar);
28            }
29        }
30
31        System.out.println(sStack);
32        System.out.println(tStack);
33
34        return tStack.equals(sStack);
35    }
36}
37
38// solution 1: stack
39// insert string chars in to stack 
40// if char is # pop
41// compare the two string 
42
43