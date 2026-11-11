public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String s = "ab-cd";
        char[] ch = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while(start < end){
            while(start<end && !Character.isLetter(s.charAt(start))){
                start++;
            }
            while(start < end && !Character.isLetter(s.charAt(start))){
                end++;
            }
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        System.out.println(String.valueOf(ch));
    }
}
