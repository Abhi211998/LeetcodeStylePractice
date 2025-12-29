package Stacks;

import java.util.Stack;

public class ValidParenthesis {

    public boolean isValid(String s){

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){

            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.pop();
                if((ch == ')' && top != '(') ||
                   (ch == '}' && top != '{') ||
                   (ch == ']' && top != '[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        ValidParenthesis vp = new ValidParenthesis();
        String[] tests = {"()", "()[]{}", "(]", "([)]", "{[]}"};
        for (String t : tests) {
            System.out.println(t + " -> " + vp.isValid(t));
        }
    }

}