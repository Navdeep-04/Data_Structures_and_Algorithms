import java.util.*;
public class SetMatrixZeroes1 {
    public static void main(String[] args) {
        //optimal approach
        int[][] matrix = new int[][]{
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int r : row){
            for(int i = 0; i < matrix[0].length; i++){
                 matrix[r][i] = 0;
            }
        }
        for(int c: col){
            for(int i = 0; i < matrix.length; i++){
                matrix[i][c] = 0;
            }
        }
        for(int[] num: matrix){
            System.out.println(Arrays.toString(num));
        }
    }
}
