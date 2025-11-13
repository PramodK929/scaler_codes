import java.util.Stack;

public class BalancedCheck {
    
    public static void main(String[] args) {
        String s = "{[()]}";

        boolean isBalanced = checkBalanced(s);
        if(isBalanced) {
            System.out.println("The string is balanced.");
        } else {
            System.out.println("The string is not balanced.");
        }
    }

    private static boolean checkBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else if(ch == '}' || ch == ']' || ch == ')') {
                if(stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if((ch == '}' && top != '{') ||
                   (ch == ']' && top != '[') ||
                   (ch == ')' && top != '(')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
