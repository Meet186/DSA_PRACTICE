import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void rateInMaze2direction(int r , int c){
        helper(r,c,"");
    }

    static void helper(int r,int c,String s ){
       if(r < 1 || c < 1) return;
       if(r == 1 && c == 1){
           System.out.println(s);
           return;
       }
       // go down
       helper(r-1,c,s+"D");
       // go right
       helper(r,c-1,s+"R");

    }


    static List<List<Integer>> subset(int nums []){
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for(int num: nums){
            int n = result.size();
            for(int i=0; i < n; i++){
                List<Integer> temp = new ArrayList<>(result.get(i));
                temp.add(num);
                result.add(temp);
            }
        }
        return result;
    }

    static ArrayList<String> subset(String s,String currans){
        if(s.length() == 0){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(currans);
            return ans;
        }
        char ch = s.charAt(0);
        ArrayList<String> left = subset(s.substring(1),currans);
        ArrayList<String> right = subset(s.substring(1),ch+currans);

        left.addAll(right);
        return left;
    }

    static ArrayList<String> subset2(String s){
        ArrayList<String> ans = new ArrayList<>();
        if(s.length() == 0){
            ans.add("");
            return ans;
        }
        char ch = s.charAt(0);
        ArrayList<String> smallans = subset2(s.substring(1));
        for(  var ss  : smallans){
            ans.add(ss);
            ans.add(ch+ss);

        }
        return ans;
    }



    public static void main(String[] args) {


    }
}