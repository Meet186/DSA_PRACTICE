import LLSTACK.stack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class test {

    static String mergeString(String str){
        StringBuilder sb = new StringBuilder(str);
        String ans  = "" + str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr == prev){
                count++;
            } else {
                if(count > 1){
                    ans += count;
                    count = 1;
                    ans += curr;

                }
            }


        }

        return  ans;
    }

    static boolean isPallindrom(String str){
        return helper(str,0,str.length()-1);
    }

    static boolean helper(String str, int i, int j){
        if(i >= j){
            return true;
        }
        return (str.charAt(i) == str.charAt(j) && helper(str,i+1,j-1));
    }

    public static void main(String[] args) {
        String str = "level";
        boolean ans = isPallindrom(str);
        System.out.println(ans);


    }

    static String removeA(String s){
        if(s.isEmpty()){
            return "" ;
        }
        char curr = s.charAt(0);
        String small = removeA(s.substring(1));

        if(curr != 'a'){
            return curr + small;
        } else {
            return small;
        }
    }




}
