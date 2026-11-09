import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] prod = new int[arr.length];
        int product = 1;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(i != j){
                    product *= arr[j];
                }
            }
            prod[i] = product;
            product = 1;
        }
        System.out.println(Arrays.toString(prod));
    }
}
