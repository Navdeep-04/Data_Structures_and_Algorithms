import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "silent";
        String t = "listen";
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);

        boolean check = true;
        int i = 0;
        while(i < s1.length && i < t1.length){
            if(s1[i] != t1[i]){
                check = false;
                break;
            }
            i++;
        }
        if(check){
            System.out.println("Anagram");
        }else{
            System.out.println("Not");
        }
    }
}
