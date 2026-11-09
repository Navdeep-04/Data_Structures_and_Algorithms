public class PeakElementFind {
    public static void main(String[] args) {
        int[] arr = {1,2,20,3,5,1};
        System.out.println(peak(arr));
    }
    static int peak(int[] arr){
        int n =  arr.length;
        int max = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
