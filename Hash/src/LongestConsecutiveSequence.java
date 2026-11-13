import java.util.*;
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {9,1,-3,2,4,8,3,-1,6,-2,-4,7};
        Arrays.sort(nums);
        int finalCount = 0;
        int count = 1;
        for(int i = 0; i < nums.length - 1; i++ ){
            if(nums[i] < nums[i+1] && nums[i+1] == nums[i] + 1){
                count++;
            }
            else if(nums[i] == nums[i+1]){
                continue;
            }
            else{
                finalCount = Math.max(finalCount, count);
                count = 1;
            }
        }
        finalCount = Math.max(finalCount, count);

        System.out.println(finalCount);
    }
}
