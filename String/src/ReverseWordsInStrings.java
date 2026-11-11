import java.util.*;
public class ReverseWordsInStrings
{
    public static void main(String[] args) {
        String str = "  the   sky is blue  ";
        StringBuilder  result = new StringBuilder();
        int n = str.length();
        int i = 0;
        while(i < n){
            // Search first non-space character
            while(i < n && str.charAt(i) == ' '){
                i++;
            }
            if (i >= n){
                break;
            }
            int j = i + 1;
            while(j < n && str.charAt(j) != ' '){
                j++;
            }
            String Sub = str.substring(i, j);
            if(result.length() == 0){
                result.append(Sub);
            }
            else{
                result.insert(0,Sub+" ");
            }
            i = j + 1;
        }
        System.out.println(result);
    }
}
