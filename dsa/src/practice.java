import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class practice {

    public static void main(String[] args) {
        String arr [] = {"mat","cat", "rat", "dog"};
        String ch = "mat";
        int ans  = charCount(arr,ch);
        System.out.println((ans));
    }

    static int charCount(String words [],String ch){
        int charCount [] = new int[26];
        char charArray [] = ch.toCharArray();
        for(char el : charArray){
            charCount[el-'a']++;
        }

        int result = 0;
        for(String word : words){
            int wordCount [] = new int[26];
            char wordArray [] = word.toCharArray();
            for(char el : wordArray){
                wordCount[el-'a']++;
            }
            boolean ok = true;
            for (int i = 0; i < 26; i++) {
                if(wordCount[i] > charCount[i]){
                    ok = false;
                }
            }
            if(ok){
                result += word.length();
            }
        }
        return result;

    }


}