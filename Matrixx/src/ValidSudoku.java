import java.util.*;
public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '5', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        boolean check = true;
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){

                if(board[i][j] != '.') {
                    String row = board[i][j] + "row" + i;
                    String col = board[i][j] + "col" + j;
                    String box = board[i][j] + "box" + (i / 3) + "&" + (j / 3);

                    map.put(row, map.getOrDefault(row, 0) + 1);
                    map.put(col, map.getOrDefault(col, 0) + 1);
                    map.put(box, map.getOrDefault(box, 0) + 1);

                    if(map.get(row) > 1 || map.get(col) > 1 || map.get(box) > 1){
                        check = false;
                        break;
                    }
                }
            }
        }
        System.out.println(map);
        System.out.println(check);
    }
}
