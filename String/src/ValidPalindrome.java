public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        String str2 = "";
        for(char i : str.toCharArray()){
            if(Character.isLetter(i) || Character.isDigit(i)){
                str2 += Character.toLowerCase(i);
            }
        }
        System.out.println(str2);
        int start = 0;
        int end  = str2.length() -1;
        boolean check = true;
        while(start <= end){
            if(str2.charAt(start) != str2.charAt(end)){
                check = false;
                break;
            }
            start++;
            end--;
        }
        if(check){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
