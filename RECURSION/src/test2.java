import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test2 {

    static int frogJump(int h [], int n , int index){
        if(index == n-1){
            return 0;
        }
        int op1 =  frogJump(h,n,index+1) + Math.abs(h[index]-h[index+1]);
        if(index == n-2) return op1;
       int op2 =  frogJump(h,n,index+2)+ Math.abs(h[index]-h[index+2]);
        return   Math.min(op2,op1);

    }

    static String removeA(String s){
        if(s.isEmpty()){
            return "";
        }
        String rem = removeA(s.substring(1));
        char curr = s.charAt(0);

        if(curr != 'a') {
          return   curr+rem;
        } else {
            return rem;
        }

    }

    static ArrayList<String> subset(String s , String currans){
        if(s.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(currans);
            return list;
        }
      ArrayList<String> left =  subset(s.substring(1),currans);
      ArrayList<String> right =   subset(s.substring(1),s.charAt(0) + currans);
      left.addAll(right);
      return left;
    }



    public static void main(String[] args) {

    ArrayList<String> ans =    subset("abc","");
        System.out.println(ans);



    }

    }
