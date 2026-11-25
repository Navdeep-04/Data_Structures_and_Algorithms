public class SearchInaRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 5, 6, 7, 8, 9, 0, 1, 2};
        int target = 0;
        int start = 0;
        int end = nums.length - 1;
        int index = -1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] == target){
                index = mid;
                break;
            }
            if(nums[start] <= nums[mid]){
                if(target >= nums[start] && target <= nums[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(target >= nums[mid] && target <= nums[end]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        System.out.println(index);
    }
}
