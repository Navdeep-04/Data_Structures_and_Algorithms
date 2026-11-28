import java.util.*;
public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>(Collections.nCopies(arr.length, -1));
        for(int i = arr.length - 1; i >= 0; i--){
            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }

            if(!stack.isEmpty()) {
                res.set(i, stack.peek());
            }

            stack.push(arr[i]);
        }
        System.out.println(res);
    }
}
