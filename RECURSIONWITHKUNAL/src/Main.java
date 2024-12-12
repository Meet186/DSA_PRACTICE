//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {





    static int reverse(int n ){
        return helper(n,0);
    }
    static int helper(int n , int reversed){
        if(n == 0) return reversed;
        reversed = reversed * 10 + n%10;
        return helper(n/10,reversed);
    }

    static int count0(int n ){
        return helperCount0(n,0);
    }
    static int helperCount0(int n , int c){
        if(n == 0) return c;
        int rem = n%10;
        if(rem == 0 ){
            return helperCount0(n/10,c+1);
        } else {
            return helperCount0(n/10,c);
        }
    }



    static int numberOfStepFor0(int n){
        return helperfornumberOfStepFor0(n,0);
    }

    static int helperfornumberOfStepFor0(int n , int step){
        if(n == 0) return step;
        if(n % 2 == 0){
            return helperfornumberOfStepFor0(n/2,step+1);
        } else {
            return helperfornumberOfStepFor0(n-1,step+1);
        }
    }

    static int count(String s ){
        if(s.isEmpty()){
            return 0;
        }

        return count(s.substring(1)) + 1;

    }

    public static void main(String[] args) {





    }
}