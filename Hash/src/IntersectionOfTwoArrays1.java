import java.util.*;
public class IntersectionOfTwoArrays1 {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        Set<Integer> set = new HashSet();
        Set<Integer> set2 = new HashSet();
        for(int num : nums1){
            set.add(num);
        }
        for(int num : nums2){
            if(set.contains(num)){
                set2.add(num);
            }
        }
        int[] result = new int[set2.size()];
        int i = 0;
        for(int num : set2){
            result[i] = num;
            i++;
        }
        System.out.println(Arrays.toString(result));
    }
}
