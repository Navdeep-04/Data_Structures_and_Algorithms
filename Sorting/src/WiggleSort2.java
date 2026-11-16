import java.util.Arrays;
public class WiggleSort2 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2,1,2,2,1};
        Arrays.sort(nums);
        int i = 0;
        int end = nums.length - 1;
        int mid = end / 2;
        int[] arr = new int[nums.length];

        while(mid >= 0 || end > (nums.length-1)/2 ){
            if(i % 2 == 0){
                arr[i++] = nums[mid];
                mid--;
            }
            else{
                arr[i++] = nums[end];
                end--;
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
