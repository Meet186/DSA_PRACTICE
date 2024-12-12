import java.util.Arrays;

public class questions {
    public static void main(String[] args) {
        int arr [] = {-13,20,-4,0,7,18,-4,3};
        sortSepratelly(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void sortZeroToLastOnly(int nums []){
        int n = nums.length;

        for (int i = 0; i < nums.length; i++) {
            boolean flag = false;
            for (int j = 0; j < n-i-1; j++) {
                if(nums[j] == 0 && nums[j+1] != 0){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    flag = true;
                }
            }

            if(!flag){
                return;
            }
        }
    }

    static void sortInLexicographical(String fruits[]){
        int n = fruits.length;

        for (int i = 0; i < n-1; i++) {
            int min_index = i;
            for (int j = i+1; j <n ; j++) {
               if(fruits[j].compareTo(fruits[min_index]) < 0){
                   min_index = j;
               }

            }
            if(min_index != i){
                    String temp = fruits[i];
                    fruits[i] = fruits[min_index];
                    fruits[min_index] = temp;
            }
        }
    }

    // sort only one element input - [10,5,6,7,8,9,3] output - [3,5,6,7,8,9,10]

    static void sortArray(int arr []){
        int n = arr.length;
        int x = -1;
        int y = -1;
        if(n <= 1){
            return;
        }
        for (int i = 1; i < n; i++) {
            if(arr[i-1] > arr[i]){
                if(x == -1){
                    x = i-1;
                    y = i;
                } else {
                    y = i;
                }
            }
        }

        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    // sort negative / positive seperetaly input - [-13,20,-4,0,7,18,-4,3] output - [-13,-4,0,7,18,3]

    static void sortSepratelly(int arr []){
        int piviot = 0;
        int si = 0;
        int ei = arr.length - 1;

        while (si < ei){
            while (arr[si] < piviot) si++;
            while (arr[ei] >= 0) ei--;
            if(si < ei){
                int temp = arr[si];
                arr[si] = arr[ei];
                arr[ei] = temp;
                si++;
                ei--;
            }

        }
    }
}
