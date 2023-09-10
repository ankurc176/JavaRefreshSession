package Program;

import java.util.Stack;

public class StringPattern {

    public static void main(String[] args) {

        String s = "()";
        //System.out.println(isValid(s));
        System.out.println(isValidCheck(s));
    }


    public static  boolean isValid(String str) {
        String s = "(]";
        int count = 0;
        boolean flag = false;
        for (int i = 0; i<s.length();i++) {
            char c = s.charAt(i);
            if (c =='(' || c == '{' || c == '[') {
                count ++;
            }
        }
        for (int i = 0; i<s.length();i++) {
            char c = s.charAt(i);
            if (c ==')' || c == '}' || c == ']') {
                count --;
            }
        }
        if(count == 0) {
            flag = true;
            return flag;
        }
        else {
            return flag;
        }
    }

    //STACK IMPLEMENTATION

    public static boolean isValidCheck (String s) {
        String str ="]";  /// Stack = (
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i< s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == ']') {
                if(stack.peek()=='[') {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
            else if (ch == '}') {
                if(stack.peek()=='{') {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
            else if (ch == ')') {
                if(stack.peek() == '(') {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
            else {
                stack.push(ch);
            }
        }
        if(stack.size() == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
