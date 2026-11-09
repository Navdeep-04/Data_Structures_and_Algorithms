import java.util.ArrayList;

public class ExtractAnInteger1 {
    public static void main(String[] args) {
        String str = "1: Geeks for geeks, 2: geeksfor geeks, 3: forGeeksgeeks 56";
        ArrayList<String> list = new ArrayList<>();
        String str1 = "";
        for(char ch : str.toCharArray())
        {
            if ( ch >= '0' && ch <= '9')
            {
                str1 += ch;
            }
            else{
                if(str1.length()>0)
                {
                    list.add(str1);
                    str1 = "";
                }
            }
        }
        if (str1.length() > 0){
            list.add(str1);
        }
        System.out.print(list);
    }
}
