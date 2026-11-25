import java.util.Arrays;

public class SquaresOfaSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int start = 0;
        int end = nums.length - 1;
        int[] result = new int[nums.length];
        int i = nums.length - 1;
        while(start <= end){
            int startProd = nums[start] * nums[start];
            int endProd = nums[end] * nums[end];
            if(startProd < endProd){
                result[i] = endProd;
                end--;
            }
            else{
                result[i] = startProd;
                start++;
            }
            i--;
        }
        System.out.println(Arrays.toString(result));
    }
}
