import java.util.Arrays;

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int m = matrix[0].length;
        int n = matrix.length;
        int target = 3;
        int start = 0;
        int end = (m * n) - 1;
        int[] index = {-1,-1};
        while(start <= end){
            int mid = (start + end)/2;
            int i = mid / m;
            int j = mid % m;
            if(matrix[i][j] == target){
                index[0] = i;
                index[1] = j;
                break;
            }
            else if(matrix[i][j] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        System.out.println(Arrays.toString(index));
    }
}
