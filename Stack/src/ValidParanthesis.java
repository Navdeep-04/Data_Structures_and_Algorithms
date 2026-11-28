import java.util.Stack;
public class ValidParanthesis {
    public static void main(String[] args) {
        String s = "([{}][]())";
        Boolean check = true;
        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray()) {
            if (ch == '(') {
                stack.push(')');
            } else if (ch == '[') {
                stack.push(']');
            } else if (ch == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || stack.pop() != ch) {
                check = false;
            }
        }
        if(check){
            System.out.println(stack.isEmpty());
        }
        else {
            System.out.println(check);
        }
    }
}