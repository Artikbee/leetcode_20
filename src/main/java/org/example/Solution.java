package org.example;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == ')' && !stack.isEmpty() && stack.peek()=='(')
                stack.pop();
            else if (c == '}' && !stack.isEmpty() && stack.peek()=='{')
                stack.pop();
            else if (c == ']' && !stack.isEmpty() && stack.peek()=='[')
                stack.pop();
            else
                stack.push(c);
        }

        return stack.isEmpty();

        /*if (s.length() == 1)
            return false;

        Stack<Character> stack = new Stack<>();

        for (char n : s.toCharArray()) {
            if (n == '(')
                stack.push('(');
            else if (n == '[')
                stack.push('[');
            else if (n == '{')
                stack.push('{');
            else if(n == ')' & stack.peek() == '(')
                stack.pop();

            else if(n == ']' & stack.peek() == '[')
                stack.pop();
            else if(n == '}' & stack.peek() == '{')
                stack.pop();
            else
                break;
        }

        if (stack.isEmpty())
            return true;
        else
            return false;*/
    }
}
