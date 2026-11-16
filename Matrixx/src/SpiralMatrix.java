import java.util.*;
public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        List<Integer>  arr = new ArrayList<>();
        int n = matrix.length, m = matrix[0].length;
        int left = 0, right = m-1, top = 0, bottom = n-1;
        int dir = 0;
        while(left <= right && top <= bottom){
            switch (dir){
                case 0 -> {
                    // left to right
                    for(int i = left; i <= right; i++){
                        arr.add(matrix[top][i]);
                    }
                    top++;
                } case 1 -> {
                    // top to bottom
                    for(int i = top; i <= bottom; i++){
                        arr.add(matrix[i][right]);
                    }
                    right--;
                } case 2 -> {
                    // right to left
                    for(int i = right; i >= left; i--){
                        arr.add(matrix[bottom][i]);
                    }
                    bottom--;
                } case 3 -> {
                    // bottom to top
                    for(int i = bottom; i >= top; i--){
                        arr.add(matrix[i][left]);
                    }
                    left++;
                }
            }
            dir = (dir + 1) % 4;
        }
        System.out.println(arr);
    }
}
