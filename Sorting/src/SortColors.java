import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        int low = 0, mid = 0, high = nums.length - 1;
        while(mid <= high){
            if(nums[mid] == 2){
                swap(nums, mid, high--);
            }
            else if(nums[mid] == 0){
                swap(nums, low++, mid++);
            }
            else {
                mid++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
