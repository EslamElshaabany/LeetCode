1class Solution {
2    public boolean backspaceCompare(String s, String t) {
3        int sI = s.length() - 1;
4        int tI = t.length() - 1;
5
6        // Use OR: keep going as long as either pointer has something left
7        while (sI >= 0 || tI >= 0) {
8            sI = nextValid(s, sI);
9            tI = nextValid(t, tI);
10
11            // Both exhausted at the same time → match so far
12            if (sI < 0 && tI < 0) return true;
13
14            // One exhausted, other still has chars → mismatch
15            if (sI < 0 || tI < 0) return false;
16
17            // Both point to a real character → compare
18            if (s.charAt(sI) != t.charAt(tI)) return false;
19
20            sI--;
21            tI--;
22        }
23        return true;
24    }
25
26    // Skips past all characters that get deleted by backspaces,
27    // returns the index of the next "real" character (or -1 if none left)
28    private int nextValid(String str, int i) {
29        int skip = 0;
30        while (i >= 0) {
31            if (str.charAt(i) == '#') {
32                skip++;      // one more char to delete
33                i--;
34            } else if (skip > 0) {
35                skip--;      // this char is deleted by a backspace
36                i--;
37            } else {
38                break;       // real character, stop
39            }
40        }
41        return i;
42    }
43}
44// solution 1: stack
45// insert string chars in to stack 
46// if char is # pop
47// compare the two string 
48
49
50// solution 2: two pointers (fixed)
51// for each string have a pointer starting from the end
52// loop while either pointer >= 0 (not both)
53// for each pointer, find the next valid char using a skip counter:
54//   if current char is # increment skip and move left
55//   if skip > 0 and current char is not #, decrement skip and move left (char is deleted)
56//   else current char is real, stop
57// after finding both valid positions:
58//   if both pointers < 0 return true (both exhausted together)
59//   if only one < 0 return false (one has leftover chars)
60//   if chars at both pointers differ return false
61//   else decrement both pointers and continue
62// return true
63