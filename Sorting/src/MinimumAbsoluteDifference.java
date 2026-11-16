import java.util.*;
public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 1, 3};
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 1; i < arr.length; i++){
            int currMin = arr[i] - arr[i - 1];
            if(currMin < min){
                min = currMin;
                nums = new ArrayList<>();
            }
            if(currMin == min){
                nums.add(arr[i-1]);
                nums.add(arr[i]);
            }
        }
        int[][] res = new int[nums.size()/2][2];
        int index = 0;
        for(int i = 0; i < res.length; i++){
            for(int j = 0; j < res[0].length; j++) {
                res[i][j] = nums.get(index);
                index++;
            }
        }
        System.out.println(nums);
        System.out.println(min);
        for(int[] i : res){
            System.out.println(Arrays.toString(i));
        }
    }
}
