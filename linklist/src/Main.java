import LinkLIST.linklist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        String name = "meet";
        boolean ans = isPlindrom(name);
        System.out.println(ans);

    }

    static boolean isPlindrom(String str){
        return helper(str,0,str.length()-1);

    }

     static boolean helper(String str, int i, int j) {
        if(i > j){
            return true;
        }
        return (str.charAt(i) == str.charAt(j) && helper(str,i+1, j-1));
    }




}