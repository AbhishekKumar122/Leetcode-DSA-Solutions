package Stack_DS;

import java.util.Stack;

public class DuplicateBracket {

    public static boolean findDuplicateBracket(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                if (stack.peek() == '(') {
                    return true;
                } else {
                    while (stack.peek() != '(') {
                        stack.pop();
                    }
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }

        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b))";
        boolean ans = findDuplicateBracket(str);

        System.out.println(ans);

    }
}
