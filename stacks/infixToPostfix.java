package stacks;

import java.util.HashMap;
import java.util.Stack;

public class infixToPostfix {
    public static void main(String[] args) {
        String  A = "a+b*(c^d-e)^(f+g*h)-i";
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> prec = new HashMap<>();
        prec.put('^', 1);
        prec.put('/', 2);
        prec.put('*', 2);
        prec.put('+', 3);
        prec.put('-', 3);
        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            if(ch >= 'a' && ch <= 'z') sb.append(ch);
            else if(ch == '(') stack.push(ch);
            else if(ch == ')'){
                while(!stack.empty() && stack.peek() != '('){
                    sb.append(stack.pop());
                }
                stack.pop();
            }
            else if(prec.containsKey(ch)){
                while(!stack.empty() && stack.peek()!= '(' && (prec.get(stack.peek()) <= prec.get(ch))){
                    sb.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        System.out.println(sb);
    }
}
