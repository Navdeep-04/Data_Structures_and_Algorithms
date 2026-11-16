import java.util.Arrays;
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int i = 0;
        boolean check = true;
        int value = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if (nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j+1){
                value = j+1;
                check = false;
                break;
            }
        }
        System.out.println(Arrays.toString(nums));
        if(check){
            System.out.println(nums.length + 1);
        }
        else{
            System.out.println(value);
        }
    }
}
