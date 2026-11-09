import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = {1,2,3,4,5};
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    static void rotate(int[] arr, int k){
        int n = 0;
        for(int j = 0; j < k; j++) {
            int temp = arr[0];
            for(int i = 0; i < arr.length - 1; i++){
                arr[i] = arr[i + 1];
            }
            arr[arr.length-1] = temp;
        }
    }
}
