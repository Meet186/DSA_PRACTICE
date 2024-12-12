public class reverseVowelInString {
    public static void main(String[] args) {
        String s = "hello";
       String ans = reverseVowel(s);
        System.out.println(ans);
    }
    static String reverseVowel(String s){
        char ch [] = s.toCharArray();
        int i = 0;
        int j = s.length()-1;
        while (i < j){
            if(!(isVowel(ch[i]))){
                i++;
            } else if (!(isVowel(ch[j]))){
                j--;
            } else {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
        }
        return new String(ch);
    }
    static boolean isVowel(char ch){
      char  c = Character.toLowerCase(ch);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}
