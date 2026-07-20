/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds;

import java.util.Stack;

/**
 *
 * @author prana
 */
public class DataStructure {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // If it's an opening bracket, push it
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // If closing bracket but stack is empty → invalid
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Check if it matches the correct opening
                if (c == ')' && top != '(') {
                    return false;
                }
                if (c == '}' && top != '{') {
                    return false;
                }
                if (c == ']' && top != '[') {
                    return false;
                }
            }
        }

        // If stack is empty, all brackets matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String checkThis = "({})";
        char[] charArr = checkThis.toCharArray();
        Stack stack = new Stack();
        for (int i = 0; i < checkThis.length() - 1; i++) {
            if (charArr[i] == '(' || charArr[i] == '{' || charArr[i] == '[') {
                stack.add(charArr[i]);
            } else {
                if (stack.peek().equals(")") || stack.peek().equals("}") || stack.peek().equals("]")) {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
