import java.util.Arrays;
public class RotateImage90degree {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};
//        for(int i = 0; i < matrix.length - 1; i++){
//            for(int j = i + 1; j < matrix[0].length; j++){
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i] = temp;
//            }
//        }
        for(int[] num: matrix) {
            System.out.println(Arrays.toString(num));
        }
//        int j = 0;
//        for(int i = 0; i < matrix.length; i++){
//            {
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[i][matrix.length - 1];
//                matrix[i][matrix.length - 1] = temp;
//            }
//        }
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
        for(int[] num: matrix) {
            System.out.println(Arrays.toString(num));
        }
    }
}
