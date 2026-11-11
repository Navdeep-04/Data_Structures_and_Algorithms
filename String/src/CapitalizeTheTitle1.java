import java.util.*;
public class CapitalizeTheTitle1 {
    public static void main(String[] args) {
        String str = "capiTalIze tHe titLe";
        String[] arr = str.split(" ");
        String str2 = "";
        for(int i = 0; i < arr.length; i++){
            String str1 = arr[i];
            String str3 = "";
            for(int j = 0; j < str1.length(); j++){
                if(str1.length() > 2 && j == 0){
                    str3 += Character.toUpperCase(str1.charAt(j));
                }else{
                    str3 += Character.toLowerCase(str1.charAt(j));
                }
            }
            str2 += str3+" ";
        }
        System.out.print(str2);
    }
}
