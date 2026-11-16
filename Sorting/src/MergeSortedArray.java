import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;
        int i = 0, j = 0;
        int[] arr = new int[m+n];
        int index = 0;
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                arr[index] = nums1[i];
                i++;
            }
            else{
                arr[index] = nums2[j];
                j++;
            }
            index++;
        }
        while(i < m){
            arr[index] = nums1[i];
            i++;
            index++;
        }
        while(j < n){
            arr[index] = nums2[j];
            j++;
            index++;
        }
        for(int itr = 0; itr < arr.length; itr++){
            nums1[itr] = arr[itr];
        }
        System.out.println(Arrays.toString(nums1));
    }
}
