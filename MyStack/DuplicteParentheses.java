package MyStack;

import java.util.Stack;

public class DuplicteParentheses {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);

            if (currChar == ')') { // closing bracket
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }

                if (count < 1) {
                    return true; // duplicate
                } else {
                    s.pop(); // opening bracket
                }
            } else {
                s.push(currChar);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str1 = "((a+b))"; // true
        String str2 = "(a-b)"; // false

        System.out.println(isDuplicate(str1));
        System.out.println(isDuplicate(str2));
    }
}
