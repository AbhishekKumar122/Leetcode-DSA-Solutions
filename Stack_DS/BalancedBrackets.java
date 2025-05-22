package Stack_DS;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        String str = "{[()]}";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                boolean val = handleClosing(stack, ch);
                if (!val) {
                    System.out.println("false");
                    return;
                }
            }
        }
        System.out.println(stack.isEmpty());
    }

    public static boolean handleClosing(Stack<Character> stack, char closing) {
        if (stack.isEmpty()) {
            return false;
        }
        char top = stack.peek();

        if ((closing == ')' && top != '(') ||
                (closing == '}' && top != '{') ||
                (closing == ']' && top != '[')) {
            return false;
        }
        stack.pop();
        return true;
    }
}
