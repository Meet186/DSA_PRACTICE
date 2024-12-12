import java.util.Arrays;
import java.util.Scanner;

public class array16lec {


    static  void  print2D(int [][] arr){
        for (int [] el : arr){
            System.out.println(Arrays.toString(el));
        }
    }


    static int findAccurance(int[] arr, int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){

                count++;
            }

        }
        return count;
    }

    static void printArray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ,");

        }
        System.out.println();
    }

    static void chngeArray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;

        }
    }

    static void changeVal(int a){
            a = 0;
    }

    static int lastAccruance(int[] arr, int x){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                ans = i;
            }

        }
        return ans;
    }

    static void strictlyGreater(int [] arr , int x){
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= x){
                ans = new int[]{arr[i]};
                printArray(ans);
            }

        }


    }

    static boolean issorted(int arr []){
        boolean check = true;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]){
                check = false;
            }
        }
        return check;
    }

    static int [] smallAndLargestval(int arr []){
        Arrays.sort(arr);
        int ans [] = {arr[0] , arr[arr.length-1]};
        return ans;
    }
    static int [] kthsmallAndLargestval(int arr [] , int k){
        Arrays.sort(arr);
       int ans [] = {arr[k-1] , arr[arr.length-k]};
       return ans;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter Array size");
//        int n = sc.nextInt();
//
//        int [] arr = new int[n];
//
//
//        System.out.println("Enter Array Input...");
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i] = sc.nextInt();
//
//        }
//
//        printArray(arr);

        int[] arr = {1,4,7};
        // shallow copy...
//        int arr2[] = arr;
        // deep copy...
        int[] arr2 = arr.clone();
//        int arr2[] = Arrays.copyOf(arr,arr.length);
//        int arr2[] = Arrays.copyOfRange(arr,0,1);


//        System.out.println("before change the value... arr1");
//        printArray(arr);
//        System.out.println("before change the value... arr2");
//        printArray(arr2);
//
//        System.out.println("Afte change the value... arr2");
//        arr2[0] = 45;
//        printArray(arr2);
//
//        System.out.println("Afte change the value... arr1");
//        printArray(arr);

        int a = 45;

//        changeVal(a);
//        System.out.println("before change");
//        printArray(arr);
//        System.out.println("after change arr2..arr2");
//        chngeArray(arr2);
//        printArray(arr2);
//        System.out.println("after change arr2..arr1");
//        printArray(arr);
//        System.out.println(arr);

        int[] arr3 = {1,4,6,8,10};

        int ans [] = kthsmallAndLargestval(arr3,2);
        printArray(ans);



    }
}
