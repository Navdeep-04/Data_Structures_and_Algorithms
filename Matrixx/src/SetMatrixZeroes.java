import java.util.*;
public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 1, 1, 1},
                {1, 0, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
//        List<Integer> row = new ArrayList<>();
//        List<Integer> col = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        System.out.println(row+ " "+ col);
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(row.contains(i) || col.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
        for(int[] mat : matrix){
            System.out.println(Arrays.toString(mat));
        }
    }
}
