//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void printArray(int [] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    static void reverse(int [] arr){
        int i = 0, j = arr.length-1;
        while (i < j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }


    static void swap(int [] arr , int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortZeroByPointer(int [] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while (left < right){
            if(arr[left] == 1 && arr[right] == 0){
                swap(arr,left,right);
                left++;
                right--;
            }

            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1){
                right--;
            }
        }

    }

    static void sortZero(int [] arr){
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i] == 0){
                count++;
            }
        }

        for (int i = 0; i < n; i++) {
            if(i < count){
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }

        }


    }

    static void sortByOddEven(int arr []){
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while (left < right){

            if(arr[left] % 2 == 1 && arr[right] % 2 == 0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left] % 2 == 0){
                left++;
            }
            if(arr[right] % 2 == 1){
                right--;
            }

        }

    }

    static int [] sortedSquareArrayBYPointer(int [] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int k = 0;
        int ans [] = new int[n];

        while (left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }

        reverse(ans);
        return ans;
    }

    static void sortArray(int arr []){
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n ; j++) {
                if(arr[i] > arr[j]){
                    swap(arr,i,j);
                }

            }

        }



    }
    static  int [] sortSquareArray(int arr []){
        int n = arr.length;
        int ans [] = new int[n];
        int left = 0;
        int right = n-1;
        int k = n-1;

        while (left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k--] = arr[left] * arr[left];
                left++;
            } else {
                ans[k--] = arr[right] * arr[right];
                right--;
            }

        }
        return ans;
    }




    static boolean isEven(int x){
        if(x % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {

        int arr [] = {0,1,0,0,1,0,1,0,1,0,1,1,0};

        int arr2  [] = {1,4,8,2,4,9,0,3,7};

        int arr3 [] = {-10,-3,-2,0,1,2,5};




    }
}