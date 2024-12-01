package validParentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> brackets = new HashMap();
        brackets.put('}', '{' );
        brackets.put(')', '(');
        brackets.put(']', '[');

        Stack<Character> stack = new Stack<>();
        char current;
        for(int i = 0; i < s.length(); i++){
           current = s.charAt(i);
            //({[
           if(!brackets.containsKey(current)){
               stack.push(current);
           }
           else {
               char last = stack.isEmpty() ? '#' : stack.pop();
               if(last != brackets.get(current)){
                   return false;
               }
           }
        }
        return stack.isEmpty();
    }
}
