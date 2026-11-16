import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[] {5, 3, 8, 1};
        for(int i = 0; i < arr.length; i++){
            boolean swap = false;
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j+1]) {
                    swap = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(!swap){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}