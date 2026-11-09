import java.util.ArrayList;

public class ExtractAnInteger {
    public static void main(String[] args) {
        String str = "1: Navdeep 2: Navo 3: Unconditional143";
        ArrayList<String> nums = new ArrayList<>();
        String str2 = "";
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                str2 += ch;
            } else {
                if (str2.length() > 0) {
                    nums.add(str2);
                    str2 = "";
                }
            }
        }
        nums.add(str2);
        System.out.println(nums);
    }
}
