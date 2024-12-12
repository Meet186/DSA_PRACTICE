import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int reverseNum(int n){
        return helper(n,0);
    }
    static int helper(int n , int reversed){
        if( n == 0) return reversed;
        reversed =  reversed * 10 + n%10;
        return helper(n/10,reversed);
    }

    static int fabnaci2(int n) {
        int p2 = 0;
        int p1 = 1;
        for (int i = 2; i <= n; i++) {
            int curr = p1 + p2;
            p2 = p1;
            p1 = curr;

        }
        return p1;
    }




    static int lastIndexOfTarget(int arr [],int target,int idx){
        if(idx < 0){

            return -1;
        }
        if(arr[idx] == target){
            return idx;
        }
        return lastIndexOfTarget(arr, target, idx - 1);



    }

    static boolean sorted(int[] arr, int idx){
        if(idx == arr.length - 1){
            return true;
        }
        if(arr[idx] > arr[idx+1]){
            return false;
        }
        return sorted(arr,idx+1);
    }


    static ArrayList<Integer> targetIdx(int arr [], int target, int idx ){
        ArrayList<Integer> result = new ArrayList<>();
        if(idx == arr.length){
            return result;
        }
        if(arr[idx] == target){
           result.add(idx);
        }
         ArrayList<Integer> smallRes = targetIdx(arr,target,idx+1);
        result.addAll(smallRes);
        return result;
    }

   static  boolean  target(int arr [], int target, int indx){
       if(indx == arr.length){
           return false;
       }
       if(arr[indx] == target){
           return true;
       }
       boolean smallans = target(arr,target,indx+1);

      if(smallans){
          return  true;
      }

       return false;
   }
   static int sumOfArray(int arr [], int indx){
       if(indx == arr.length){
           return 0;
       }
       int small = sumOfArray(arr,indx+1);
       return small + arr[indx];

   }

    static int lagrestel(int arr [], int indx ){
        if(indx == arr.length - 1){
            return arr[indx];
        }
        int smallans = lagrestel(arr,indx+1);
        return Math.max(smallans,arr[indx]);
    }

    static int hcf(int x,int y){
        while (y != 0){
            int temp = y;
            y = x%y;
            x = temp;

        }
        return x;
    }

    static int hcf2(int x, int y){
        if(y == 0){
            return x;
        }
        return hcf2(y,x%y);
    }

    static void printArray(int arr[], int indx){
        if(indx == arr.length){
            return;
        }
        System.out.println(arr[indx]);
        printArray(arr,indx+1);
    }

    static void table(int t,int to){
        if(to == 1){
            System.out.println(t);
            return;
        }
        table(t,to-1);
        System.out.println(t * to);
    }

    static int  seriesSum(int n ){
        if(n == 0){
            return 0;
        }
        if(n % 2 == 0){
            return seriesSum(n-1) - n;
        } else {
            return seriesSum(n-1) + n;
        }

    }

    static int  findSum(int n ){
        if(n == 0){
            return 0;
        }
        int recwork = findSum(n-1);
        return recwork + n;

    }

    static void multiple(int n, int k){
        if(k == 1){
            System.out.println(n);
            return;
        }
       multiple(n,k-1);
        System.out.println(n * k);

    }

    static int pow(int p,int q){
        if(q == 0){
            return 1;
        }
        return pow(p,q-1) * p;
    }
    static int pow2(int p,int q){
        if(q == 0){
            return 1;
        }
        int smallpow = pow(p,q/2);
        if(q % 2 == 0){
            return smallpow * smallpow;
        }
        return p * smallpow * smallpow;
    }


    static int sum(int n){
        if(n >= 0 && n <= 9){
            return n;
        }
        return sum(n/10) + n%10;

    }

    static void printNum(int n){
        // halt-condition
        if(n == 1){
            System.out.println(n);
            return;
        }
        // small work (recurssive work)
        printNum(n-1);
        // self-work
        System.out.println(n);


    }

    static void printNumD(int n ){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNumD(n-1);
    }

    static int factorial(int n){
        if(n == 0){
            return 1 ;
        }
        return n * factorial(n-1);
    }

    static int fabnaci(int n){

        if(n == 0 || n == 1){
            return n;
        }
        int prev = fabnaci(n-1);
        int prevprev = fabnaci(n-2);
        return prev + prevprev;
    }


    static int smallel(int arr[],int index){
        if(index == arr.length-1){
            return arr[index];
        }
        int smallerans = smallel(arr,index+1);

        if(arr[index] < smallerans){
            return arr[index];
        } else {
            return smallerans;
        }
    }

    static int smallel2(int arr [],int n){
        if(n == 1){
            return arr[0];
        }
        int smallans = smallel2(arr,n-1);
        return Math.min(smallans,arr[n-1]);

    }

    static int largestel(int arr[],int n){
        if(n == 1){
            return arr[0];
        }
        int smallans = largestel(arr,n-1);
        return Math.max(smallans,arr[n-1]);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] = {1,2,5,1,8};
//       ArrayList<Integer> ans = targetIdx(arr,21,0);
//        System.out.println(ans);
        int ans = lastIndexOfTarget(arr,1,arr.length-1);
        System.out.println(ans);






        
    }
}