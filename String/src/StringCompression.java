import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class StringCompression {
    public static void main(String[] args) {
        char[] str = {'a','a', 'b', 'b', 'b', 'b'};
        int n = str.length;
        int count = 0, index= 0;
        for(int i = 0; i < n; i++){
            count++;
            if(i+1 == n || str[i] != str[i+1]){
                str[index++] = str[i];
                if(count != 1){
                    for(char c : Integer.toString(count).toCharArray()){
                        str[index++] = c;
                    }
                }
                count = 0;
            }
        }
        System.out.println(index);
    }
}
