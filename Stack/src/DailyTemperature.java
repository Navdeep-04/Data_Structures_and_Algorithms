import java.util.*;
public class DailyTemperature {
    public static void main(String[] args) {
        int[] temperatures = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        int n = temperatures.length;
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[n];
        for(int i = n - 1; i >= 0; i--){
            while(!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                result[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        System.out.println(Arrays.toString(result));
    }
}
