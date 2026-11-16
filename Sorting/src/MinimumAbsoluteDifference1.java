import java.util.*;
public class MinimumAbsoluteDifference1 {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 1, 3};
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        ArrayList<List<Integer>> nums = new ArrayList<>();
        for(int i = 1; i < arr.length; i++){
            int currMin = arr[i] - arr[i-1];
            if(currMin < min){
                nums = new ArrayList<>();
                min = currMin;
            }
            if(currMin == min){
                nums.add(Arrays.asList(arr[i-1], arr[i]));;
            }
        }
        System.out.println(nums);
    }
}
