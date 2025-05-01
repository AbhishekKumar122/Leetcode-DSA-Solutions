package String;

import java.util.Stack;

public class ValidParentheces {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>(); // create an empty stack

        // loop through each character in the string
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";

        System.out.println(isValid(s));
    }
}
