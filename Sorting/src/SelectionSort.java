import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5,4,3,2,1};
        for(int i = 0; i < arr.length-1; i++){
            int minIndex = i;
            boolean swap = false;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    swap = true;
                    minIndex = j;
                }
            }
            if(swap) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
