import java.util.*;
public class EvaluateReversePolish {
    public static void main(String[] args) {
        String[] tokens = new String[]{"2", "1", "+", "3", "*"};
        Stack<Integer> stack = new Stack<>();
        for(String str: tokens){
            switch (str){
                case "+" -> stack.add(stack.pop() + stack.pop());
                case "-" -> {
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.add(num2 - num1);
                }
                case "*" -> stack.add(stack.pop() * stack.pop());
                case "/" -> {
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.add(num2 / num1);
                }
                default -> {
                    stack.add(Integer.parseInt(str));
                }
            }
        }
        System.out.println(stack.pop());
    }
}
