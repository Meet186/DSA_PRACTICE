import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class revrsesprial {


    static ArrayList<String> subset(String s){
        ArrayList<String> ans = new ArrayList<>();
        if(s.length() == 0){
            ans.add("");
            return ans;
        }
        char curr = s.charAt(0);
        ArrayList<String> smallans = subset(s.substring(1));
        for(String el : smallans){
            ans.add(el);
            ans.add(curr + el);
        }
        return ans;
    }


    public static void main(String[] args) {
        String set = "123ade";
        ArrayList<String> ans = subset(set);
        System.out.println(ans);
    }
}
