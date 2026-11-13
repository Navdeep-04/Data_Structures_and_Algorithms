public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "ab";
        int[] freq = new int[26];
        for(int i = 0; i < ransomNote.length(); i++){
            freq[ransomNote.charAt(i) - 'a']++;
        }
        for(int i = 0; i < magazine.length(); i++){
            freq[magazine.charAt(i) - 'a']--;
        }
        boolean check = false;
        for(int i = 0; i < ransomNote.length(); i++){
            if(freq[ransomNote.charAt(i) - 'a'] <= 0){
                check = true;
            }
            else{
                check = false;
                break;
            }
        }
        System.out.println(check);
    }
}
