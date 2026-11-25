import java.util.*;
public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        ArrayList<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n-1; i++) {
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])) {
                int start = i + 1, end = n-1, target = -(nums[i]);
                while (start < end) {
                    if (nums[start] + nums[end] == target) {
                        list.add(Arrays.asList(nums[i], nums[start], nums[end]));
                        while(start < end && nums[start] == nums[start+1]) start++;
                        while(start < end && nums[end] == nums[end-1]) end--;
                        start++;
                        end--;
                    } else if (nums[start] + nums[end] > target) {
                        end--;
                    } else {
                        start++;
                    }
                }
            }
        }
        System.out.println(list);
    }
}
