package MyStack;

import java.util.Stack;

public class ReverseString {

    public static String reverse(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        String newStr = "";

        while (!stack.isEmpty()) {
            newStr += stack.pop();
        }

        return newStr;
    }

    public static String reverseString(String str) {

        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            result.append(s.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String str = "abc";
        System.out.println(reverseString(str));
        System.out.println(reverse(str));

    }
}
