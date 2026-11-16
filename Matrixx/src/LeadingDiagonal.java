public class LeadingDiagonal {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};
        int n = matrix.length;
        for(int i = 0; i < n; i++){

            System.out.println(matrix[i][i]+" ");

            System.out.println(matrix[i][n-1-i]);
        }
    }
}
