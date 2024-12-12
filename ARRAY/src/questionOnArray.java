import java.util.Arrays;

public class questionOnArray {
    static int pairSum(int [] arr, int target){
        int ans = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            for (int j = i+1; j <n ; j++) {
                if(arr[i] + arr[j] == target){
                    ans++;
                }

            }

        }
        return ans;
    }

    static  void  print2D(int [][] arr){
        for (int [] el : arr){
            System.out.println(Arrays.toString(el));
        }
    }

    static int tripletSum(int []arr, int target){
        int n  = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1 ; j <n ; j++) {
                for (int k = j+1; k <n ; k++) {
                    if(arr[i] + arr[j] + arr[k] == target){
                        int ans [][] = {{arr[i],arr[j],arr[k]}};
                        print2D(ans);
                    }

                }

            }

        }
        return 0;
    }

    static int uniqueVal(int [] arr){ // not true for all conditions.
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1 ; j <n ; j++) {
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }

            }

        }
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i] > 0){
                ans = arr[i];
            }


        }
        return ans;
    }

    static  int largestElement(int arr[]){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }

        }
        return max;

    }

    static int secondLargestElement(int arr[]){
        int max = largestElement(arr);

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }

        }
        int secondMax = largestElement(arr);
        return secondMax;
    }

    static int firstRepeatingNumber(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <n ; j++) {
                if(arr[i] == arr[j]){
                    return arr[i];
                }

            }

        }
        return -1;

    }

    static int lastRepeatingNumber(int arr[]){
        int n = arr.length;
        for (int i = n; i > 0; i--) {
            for (int j = i + 1; j <n ; j++) {
                if(arr[i] == arr[j]){
                    return arr[i];
                }

            }

        }
        return -1;

    }

    static int kthLargestElement(int arr [] , int k){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }
            if( i  == k-1){
                System.out.println(arr[i]);
                break;
            }

        }
        return 0;

    }
    static int firstSmallestElement(int [] arr){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }

        }
        return min;

    }

    static int kthLargestElement2(int arr [] , int k){
        Arrays.sort(arr);
        int n = arr.length;
        int ans [] = new int[n];
        int j = 0;
        for (int i = n-1; i >=0; i--) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < ans.length; i++) {

            if(i == k-1){
                System.out.println(ans[i]);
            }
        }
        return 0;
    }


    static int secondSmallestElement(int [] arr){
       int min =  firstSmallestElement(arr);

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == min){
                arr[i] = Integer.MAX_VALUE;

            }

        }

        int secondmin = firstSmallestElement(arr);
        return secondmin;

    }


    static int[] reverseArray2(int [] arr){
        int i=0, j= arr.length - 1;

        while (i < j){
            swapINArray(arr,i,j);
            i++;
            j--;
        }
        return arr;
    }

    static void swapINArray(int [] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int [] reverseArray(int arr []){

        int n = arr.length;
        int ans [] = new int[n];
        int j = 0;

        for (int i = n-1; i >=0 ; i--) {
            ans[j++] = arr[i];


        }
        return ans;
    }

    static void printArray(int [] arr){
        for ( int el : arr ){
            System.out.print(el + ",");
        }
    }

    static int[] rotateArrayByK(int [] arr , int  k){

        int n = arr.length;
        k = k%n;
        int j = 0;
        int ans [] = new int[n];

        for (int i = n-k; i <n ; i++) {
            ans[j++] = arr[i];

        }

        for (int i = 0; i < n-k; i++) {
            ans[j++] = arr[i];

        }

        return ans;
    }

    static void reverseArray(int [] arr ,int i,int j){
        while (i < j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    static void swap(int arr [], int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int[] rotateByK2(int [] arr, int k){
        int n = arr.length;
        k = k%n;

        reverseArray(arr,0,n-k-1);
        reverseArray(arr,n-k,n-1);
        reverseArray(arr,0,n-1);
        return arr;
    }

    static int [] reverseArrayByK(int [] arr,int k){
        int n  = arr.length;
        int ans [] = new int[n];
        int j = 0;
        for (int i = k-1; i >= 0   ; i--) {
            ans[j++] = arr[i];
        }

        for (int i = k; i < n; i++) {
            ans[j++] = arr[i];

        }
        return ans;

    }

    public static void main(String[] args) {

        int arr [] = {1,7,1,8,7,0,9};
        int arr2 [] = {4,7,8,9,4,2,7,4,2,};
//        System.out.println(lastRepeatingNumber(arr2));
        int ex [] = {0,-2,0,-3,0,-4};
//       int ans = largestElement(arr);
//        int ans2 = secondLargestElement(ex);
//        System.out.println(secondSmallestElement(arr));
//         tripletSum(arr,12);
//        System.out.println(firstRepeatingNumber(arr));




      int ans [] =   rotateByK2(arr,2);
        printArray(ans);



    }
}
