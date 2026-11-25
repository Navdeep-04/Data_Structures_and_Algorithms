import java.util.*;
public class SquaresOfaSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            arr[i] = nums[i]*nums[i];
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
