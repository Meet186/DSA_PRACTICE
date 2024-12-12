import java.util.ArrayList;
import java.util.List;

public class uncommonchar {
    public static void main(String[] args) {
        String s = "abcdgh";
        String t = "abcde";

        List<Character> ans = unCommon(s,t);
        System.out.println(ans);

    }

    static char findDiffenrentChar(String s , String t){
        char s1 [] = s.toCharArray();
        char t1 [] = t.toCharArray();

        int sum = 0;

        for(char ch : t1){
            sum += ch;
        }
        for(char ch : s1){
            sum -= ch;

        }
        return (char) sum;
    }

    static char findDifferentChar2(String s, String t){
        char s1 [] = s.toCharArray();
        char t1 [] = t.toCharArray();
        int XOR = 0;
        for(char ch : s1){
            XOR ^= ch;
        }
        for(char ch : t1){
            XOR ^= ch;
        }
        return (char) XOR;

    }

    static List<Character> unCommon(String s, String t){

        // TC - O(s . t)
        // SC - O(S.T)
        List<Character> ans = new ArrayList<>();

        for (int i = 0; i < t.length(); i++) {
            if(!(s.contains(String.valueOf(t.charAt(i))))){
                ans.add(t.charAt(i));
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if(!(t.contains(String.valueOf(s.charAt(i))))){
                ans.add(s.charAt(i));
            }
        }
        return ans;
    }


}
