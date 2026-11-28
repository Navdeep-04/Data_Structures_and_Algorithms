import java.util.Stack;
public class BasicCalculator {
    public static void main(String[] args) {
        String s = "(1+(4+5+2)-3)+(6+8)";
        Stack<Integer> stack = new Stack<>();
        int num = 0, result = 0, sign = 1;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                num = num * 10 + (ch - '0');
            } else if (ch == '+' || ch == '-'){
                result += (sign * num);
                num = 0;
                sign = (ch == '+') ? 1 : -1;
            } else if (ch == '('){
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (ch == ')'){
                result += sign * num;
                num = 0;
                result *= stack.pop(); //sign
                result += stack.pop(); //previous result
            }
        }
        result += sign * num;
        System.out.println(result);
    }
}
