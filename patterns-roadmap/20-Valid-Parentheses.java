class Solution {
    public boolean isValid(String s) {

        ArrayDeque<Character> stack = new ArrayDeque<>();

        Map<Character, Character> closing = new HashMap<>(Map.of(
                '(', ')',
                '{', '}',
                '[', ']'));


        for (char c : s.toCharArray()) {
            if (closing.containsKey(c)) {
                stack.push(c);
            } else {
                if (!stack.isEmpty() && closing.get(stack.peek()) == c) {
                    stack.pop();
                } else {
                    return false;
                }
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

// using stack
// push the half of input 
// if the top is the correct colsing pop it
// else retun false
// retun stack is empty
