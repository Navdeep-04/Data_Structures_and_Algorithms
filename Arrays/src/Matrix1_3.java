public class Matrix1_3 {
    public static void main(String[] args) {
        int[][] matrix = {{1,3},{5,6,7},{8,9,0}};
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
