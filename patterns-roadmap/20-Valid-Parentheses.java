class Solution {

    static final Map<Character, Character> closing = Map.of(
            '(', ')',
            '{', '}',
            '[', ']');

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (closing.containsKey(c)) {
                stack.push(c);
            } else if (!stack.isEmpty() && closing.get(stack.peek()) == c) {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();

    }
}

// for every char in the array
// if it's opening char push it
// else 
// if it is equal to the stack peek pop it
// else return false
// return stack is empty
