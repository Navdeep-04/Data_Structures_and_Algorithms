import java.util.*;
public class LongestConsecutiveSequence1 {
    public static void main(String[] args) {
        int[] nums = {1,2,6,7,8};
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int count = 0;
        for(int num: set){
            int currCount = 0;
            if(!set.contains(num - 1)) {
                int j = num;
                while (set.contains(j)) {
                    j++;
                    currCount++;
                }
                count = Math.max(currCount,count);
            }
        }
        System.out.println(count);
    }
}
