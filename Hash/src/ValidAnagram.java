public class ValidAnagram {
    public static void main(String[] args) {
        String a = "silent";
        String b = "listen";
        int[] hash = new int[26];
        for(int i = 0; i < a.length(); i++){
            hash[a.charAt(i) - 'a']++;
        }
        for(int i = 0; i < b.length(); i++){
            hash[b.charAt(i) - 'a']--;
        }
        boolean check = true;
        for(int i = 0; i < hash.length; i++){
            if(hash[i] != 0){
                check = false;
                break;
            }
        }
        if(check){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not");
        }
    }
}
