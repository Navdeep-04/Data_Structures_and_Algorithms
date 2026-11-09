import java.sql.SQLOutput;
import java.util.Arrays;

public class ReverseWordsInStrings {
    public static void main(String[] args) {
        String str = "  hello world  ";
        String result = reverseStr(str);
        System.out.println(result);
    }
    static String reverseStr(String s) {
        StringBuilder str = new StringBuilder();
        String[] str1 = s.split(" ");
        for (int i = str1.length - 1; i >= 0; i--) {
            if(i > 0 && !str1[i].equals("")){
            str.append(str1[i].trim()).append(" ");
            }
            else{
                str.append(str1[i].trim());
            }
        }
        return String.valueOf(str);
    }
}
