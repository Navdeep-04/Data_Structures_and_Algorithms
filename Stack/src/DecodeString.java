import java.util.Stack;
public class DecodeString {
    public static void main(String[] args) {
        String s = "3[a]2[bc]";

        Stack<String> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch != ']'){
                stack.push(String.valueOf(ch));
            } else {
                StringBuilder str = new StringBuilder();
                while(!stack.peek().equals("[")) {
                    str.insert(0, stack.pop());
                }
                stack.pop();

                StringBuilder num = new StringBuilder();
                while(!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))){
                    num.insert(0,stack.pop());
                }
                String repeated = str.toString().repeat(Integer.parseInt(num.toString()));
                stack.push(repeated);
            }
        }
        StringBuilder result = new StringBuilder();
        for(String str : stack) {
            result.append(str);
        }
        System.out.println(result);
    }
}
