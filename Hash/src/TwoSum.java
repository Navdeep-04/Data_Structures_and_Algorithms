import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 8, 10, 25, 3, 7, 15};
        int target = 13;
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int sum = target - nums[i];
            if(!map.containsKey(sum)){
                map.put(nums[i], i);
            }
            else{
                int index = map.get(sum);
                if(nums[i] + nums[index] == target){
                    res[0] = index;
                    res[1] = i;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
