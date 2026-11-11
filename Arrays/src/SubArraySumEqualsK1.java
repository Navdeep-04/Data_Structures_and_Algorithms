public class SubArraySumEqualsK1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int k = 3;
        int count = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += arr[j];
                if(sum == k){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
