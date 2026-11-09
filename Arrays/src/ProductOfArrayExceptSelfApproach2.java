import java.util.Arrays;

public class ProductOfArrayExceptSelfApproach2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] prod = new int[arr.length];
        int product = 1;
        for(int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        for(int i = 0; i < arr.length; i++){
            prod[i] = product/arr[i];
        }
        System.out.println(Arrays.toString(prod));
    }
}
