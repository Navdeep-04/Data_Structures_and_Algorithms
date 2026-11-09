import java.util.Scanner;

public class SearchElementinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int Search = sc.nextInt();
        System.out.println(search(arr, Search));
    }
    static int search(int[] arr, int x){
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
