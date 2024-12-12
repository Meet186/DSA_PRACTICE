import java.util.ArrayList;
import java.util.List;

public class practice {
    public static void main(String[] args) {

      int ans =  findAccuranceOfA("applae",0);
        System.out.println(ans);

    }

    static int power(int n, int p){
        if(p == 1){
            return n;
        }
        return n * power(n,p-1);
    }

    static void nNaturalNum(int n){
        if( n == 1){
            System.out.print(n + " ");
            return;
        }
        nNaturalNum(n-1);
        System.out.print(n + " ");
    }

    static void evenInGivenRange(int n){
        if(n == 1){
            return;
        }
        evenInGivenRange(n-1);
        if(n % 2 == 0){
            System.out.print(n + " ");
        }
    }

    static int sumOfNum(int n ){
        if(n == 1){
            return n;
        }
       return n +  sumOfNum(n-1);
    }

    static int sumOfAllDigit(int n){
        if(n == 0){
            return n;
        }
        int first = n%10;
        return first + sumOfAllDigit(n/10);

    }

    static int reverse(int n ){
        return  helper(n,0);
    }
    static int helper(int n, int reversed){
        if(n == 0){
            return reversed;
        }
        reversed =  n%10 + reversed * 10 ;
        return helper(n/10,reversed);
    }

    static boolean pallandrom(int n ){
        return n == reverse(n);
    }

    static int fabnaci(int n){
        if(n <= 1){
           return n;
        }
        int prev = fabnaci(n-1);
        int prevprev = fabnaci(n-2);

        return prev+prevprev;
    }

    static void printArray(int arr[],int idx){
        if(idx == arr.length){
            return;
        }
        System.out.println(arr[idx]);

        printArray(arr,idx + 1);

    }

    static int sumOfArray(int arr [],int idx){
        if(idx == arr.length){
            return 0 ;
        }
        int ans = arr[idx];
        return ans + sumOfArray(arr,idx + 1);

    }

    static void printStringAllChar(String s){
        if(s.isEmpty()){
            return;
        }
        System.out.println(s.charAt(0));
        printStringAllChar(s.substring(1));

    }

    static boolean ispallandrom(String s){
      return   helper(s,0,s.length() - 1);
    }
    static boolean helper(String s, int i,int j){
        if(i > j){
            return true;
        }
        return (s.charAt(i) == s.charAt(j) && helper(s,i + 1,j-1));
    }

    static int findAccuranceOfA(String s,int idx){
        if(idx == s.length()){
            return 0;
        }
        int count = 0;
        char curr = s.charAt(idx);
        if(curr == 'a'){
            count += 1;
        }
       return count +  findAccuranceOfA(s,idx + 1);


    }
   static List<Integer> fabnaciSeries(int n){
        List<Integer> ans = new ArrayList<>();
       for (int i = 0; i < n; i++) {
           ans.add(fabnaci(i));
       }
       return ans;
   }
}
