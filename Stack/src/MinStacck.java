import java.util.*;
class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int value) {
        if(minStack.isEmpty()){
            stack.push(value);
            minStack.push(value);
        } else {
            stack.push(value);
            minStack.push(Math.min(value, minStack.peek()));
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
public class MinStacck {
    public static void main(String[] args) {

        MinStack minStack = new MinStack();

        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        System.out.println("Minimum: " + minStack.getMin()); // -3

        minStack.pop();

        System.out.println("Top: " + minStack.top());       // 0
        System.out.println("Minimum: " + minStack.getMin()); // -2
    }
}