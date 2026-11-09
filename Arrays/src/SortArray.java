import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,8,9,2};
        sorted(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sorted(int[] arr){
        Arrays.sort(arr);
    }
}
