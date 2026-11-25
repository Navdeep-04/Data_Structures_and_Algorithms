import java.util.*;
public class TwoSum1 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 8, 10, 25, 3, 7, 15};
        int target = 13;
        int[] arr = new int[2];
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            if(nums[start] + nums[end] == target){
                arr[0] = nums[start];
                arr[1] = nums[end];
                break;
            }
            else if(nums[start] + nums[end] > target){
                end--;
            }
            else{
                start++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
