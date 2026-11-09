import java.util.Arrays;

public class ProductOfArrayExceptSelf0ptimized {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] prod = new int[arr.length];

        int[] prefixProd = new int[arr.length];
        int[] suffixProd = new int[arr.length];
        int product = 1;
        for(int i = 0; i < arr.length; i++){
            product *= arr[i];
            prefixProd[i] = product;
        }
        product = 1;
        for(int i = arr.length-1; i >= 0; i--){
            product *= arr[i];
            suffixProd[i] = product;
        }
        arr[0] = suffixProd[1];
        arr[arr.length-1] = prefixProd[arr.length-2];

        for(int i = 1; i < arr.length - 1; i++){
            arr[i] = prefixProd[i-1] * suffixProd[i+1];
        }
        System.out.println(Arrays.toString(prefixProd));
        System.out.println(Arrays.toString(suffixProd));
        System.out.println(Arrays.toString(arr));
    }
}
