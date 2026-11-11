public class ReverseOnlyLetters1 {
    public static void main(String[] args) {
        String s = "ab-cd";
        char[] ch = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while(start < end){
            if(Character.isLetter(ch[start])){
                if(Character.isLetter(ch[end])){
                    char temp = ch[start];
                    ch[start] = ch[end];
                    ch[end] = temp;
                    start++;
                    end--;
                }else {
                    end--;
                }
            }else {
                start++;
            }
        }
        System.out.println(String.valueOf(ch));
    }
}
