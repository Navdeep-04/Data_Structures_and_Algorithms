public class RansomNote1 {
    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "aab";
        int[] freq = new int[26];

        for(int i = 0; i < magazine.length(); i++){
            freq[magazine.charAt(i) - 'a']++;
        }
        for(int i = 0; i < ransomNote.length(); i++){
            freq[ransomNote.charAt(i) - 'a']--;
        }
        boolean check = true;
        for (int i : freq){
            if(i<0){
                check = false;
            }
        }
        System.out.println(check);
    }
}
