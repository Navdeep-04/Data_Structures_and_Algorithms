import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = new int[2];
        a:
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i+1; j <nums.length; j++){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    break a;
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}