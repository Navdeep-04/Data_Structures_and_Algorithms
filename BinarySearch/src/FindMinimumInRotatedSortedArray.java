public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 4, 5, 1, 2};
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            int mid = (start + end)/2;
            if(nums[mid] > nums[end]){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        System.out.println(nums[start]);
    }
}
