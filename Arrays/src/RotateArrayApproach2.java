import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayApproach2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        k %= arr.length;
        rotate(arr, 0, arr.length-1);
        rotate(arr, 0, k-1);
        rotate(arr, k, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void rotate(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
