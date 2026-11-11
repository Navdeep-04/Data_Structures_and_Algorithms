import java.util.Arrays;
import java.util.HashMap;
public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "bananas";
        int hash[] = new int[128];
        for(char i: s.toCharArray()){
            hash[i - '0']++;
        }
        for(int i = 0; i < 128; i++){
            if(hash[i] != 0){
                System.out.println(hash[i]);
            }
        }

        boolean flag = false;
        int res = 0;
        for(int i: hash){
            if(i % 2 == 0){
                res += (i/2);
            } else {
                flag =true;
                res += (i-1)/2;
            }
        }
        System.out.println(flag ? (res * 2) + 1 : res * 2);
    }
}
