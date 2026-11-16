import java.util.*;
public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7};
        int[] brr = {1,2,8,9};
        int[] result = new int[arr.length+brr.length];
        int i = 0;
        int j = 0;
        int index = 0;
        while(i < arr.length && j < brr.length){
            if(arr[i] < brr[j]){
                result[index] = arr[i];
                i++;
            }else{
                result[index] = brr[j];
                j++;
            }
            index++;
        }
        while(i < arr.length){
            result[index++] = arr[i];
            i++;
        }
        while(j < brr.length){
            result[index++] = brr[j];
            j++;
        }
        System.out.print(Arrays.toString(result));
    }
}
