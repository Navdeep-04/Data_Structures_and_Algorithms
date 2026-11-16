import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,5,7,0,3,6,8};
        int start = 0;
        int end = arr.length;
        int mid = (start + end)/2;
        Sort(arr, start, end);
        System.out.println(Arrays.toString(arr));
    }
    public static void Sort(int[] arr, int start, int end){
        if(end - start == 1) return;
        int mid = (start + end)/2;
        Sort(arr, start, mid);
        Sort(arr, mid, end);
        Merge(arr, start, mid, end);
    }

    public static void Merge(int[] arr, int start, int mid, int end){
        int index = start;
        int[] result = new int[arr.length];
        int i = start, j = mid;
        while(i < mid && j < end){
            if(arr[i] < arr[j]){
                result[index] = arr[i];
                i++;
            }else{
                result[index] = arr[j];
                j++;
            }
            index++;
        }
        while (i < mid){
            result[index++] = arr[i];
            i++;
        }
        while (j < end){
            result[index++] = arr[j];
            j++;
        }
        for(int itr = start; itr < end; itr++){
            arr[itr] = result[itr];
        }
    }
}
