class CapitalizeTheTitle{
    public static void main(String[] args) {
        String str = "is caPitaliZe tHe tiTle";
        char[] ch = str.toCharArray();

        for(int i = 0; i < str.length(); i++){
            int firstIndex = i;
            while(i < str.length() && ch[i] != ' '){
                ch[i] = Character.toLowerCase(ch[i]);
                i++;
            }
            if(i - firstIndex > 2){
                ch[firstIndex] = Character.toUpperCase(ch[firstIndex]);
            }
        }
        String str1 = String.valueOf(ch);
        System.out.println(str1);
    }
}