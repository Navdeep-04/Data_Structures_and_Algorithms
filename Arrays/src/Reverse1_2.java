public class Reverse1_2
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        swap(arr,0,arr.length-1);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+", ");
        }
    }
    private static void swap(int[] res, int start,int end){
        while(start < end){
            int temp = res[start];
            res[start] = res[end];
            res[end] = temp;
            start++;
            end--;
        }
    }
}