import java.util.*;
public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        int[] heights = new int[]{2, 1, 5, 6, 2, 3};
        int n = heights.length;
        int[] pse = getPSE(heights, n);
        int[] nse = getNSE(heights, n);
        int maxArea = 0;

        for (int i = 0; i < n; i++){
            int width = nse[i] - pse[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }
        System.out.println(maxArea);
    }
    private static int[] getPSE(int[] heights, int n){
        Stack<Integer> stack = new Stack<>();
        int[] pse = new int[n];
        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            pse[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return pse;
    }
    private static int[] getNSE(int[] heights, int n){
        Stack<Integer> stack = new Stack<>();
        int[] nse = new int[n];
        for(int i = n-1; i >= 0; i--){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            nse[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }
        return nse;
    }
}
