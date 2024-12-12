import java.util.ArrayList;
import java.util.Arrays;

public class subset {


    static String removeA(String s){
        if(s.isEmpty()){
            return "";
        }
        char curr = s.charAt(0);
        if(curr == 'a'){
            return removeA(s.substring(1));
        } else {
            return curr + removeA(s.substring(1));
        }
    }


    static int frogJump(int h [], int n , int index){
        if(index == n-1){
            return 0;
        }
       int p1 =  frogJump(h,n,index+1) + Math.abs(h[index]-h[index+1]);
        if(index == n-2) return p1;
       int p2 = frogJump(h,n,index+2) + Math.abs(h[index] - h[index+2]);
       return Math.min(p2,p1);
    }


    static int reverseNum(int n ){
        return reverse(n,0);
    }

    static int reverse(int n, int reversed){
        if(n == 0) return reversed;
        reversed = reversed * 10 + n%10;
      return  reverse(n/10,reversed);
    }


    public static void main(String[] args) {

    int ans = reverseNum(1);
        System.out.println(ans);
    }
}
