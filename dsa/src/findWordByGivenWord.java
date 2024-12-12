import java.util.Arrays;

public class findWordByGivenWord {

    public static void main(String[] args) {
        String word [] = {"cat","hat","tree"};
        String ch1 = "atach";
        int ans = countChar(word,ch1);
        System.out.println(ans);
    }
    static int countChar(String words [], String ch){
        char chararray [] = ch.toCharArray();
        int charCount [] = new int[26];

        for(char el : chararray){
            charCount[el-'a']++;
        }
        int result = 0;

        for (String word : words){
            char wordarray [] = word.toCharArray();
            int wordCount [] = new int[26];
            for(char el : wordarray){
                wordCount[el-'a']++;
            }
            boolean ok = true;
            for (int i = 0; i < 26; i++) {
                if(wordCount[i] > charCount[i]){
                   ok = false;
                }
            }
            if(ok == true){
                result += word.length();
            }
        }
        return result;
    }

}
