import com.sun.source.tree.WhileLoopTree;

public class maxelinstring {
    static char maxDigitComeInString(String str){
        int count [] = new int[26];
        for(char ch : str.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                count[ch-'a']++;
            }

        }
        int maxCount = 0;
        char maxchar = ' ';

        for (int i = 0; i < count.length; i++) {
            if(count[i] > maxCount){
                maxCount = count[i];
                maxchar = (char) (i + 'a');

            }

        }
        return maxchar ;
    }
    public static void main(String[] args) {
        String str = "aaabbbcccdddeeeefgh";
        String ans = compressStr(str);
        System.out.println(ans);
    }

    static String compressStr(String str){
      String ans = "" + str.charAt(0);
      int count = 1;
        for (int i = 1; i < str.length() ; i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
           if(curr == prev){
               count++;
           } else {
               if(count > 1) ans += count;
               count = 1;
               ans += curr;

           }


        }
      return ans;
    }
}
