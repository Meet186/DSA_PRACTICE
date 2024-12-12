import java.awt.image.BandedSampleModel;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        int[] arr = {7, 9, 11, 8, 3};




    }


    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void bubbleSort(int nums[]) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                    flag = true;
                }

            }
            if (!flag) {
                return;
            }
        }

    }

    static void insertionSort(int nums[]) {
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            int j = i;

            while (j > 0 && nums[j] < nums[j - 1]) {
                swap(nums, j, j - 1);
                j--;
            }

        }
    }

    static void selectionSort(int nums[]) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            int min_index = i;

            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[min_index]) {
                    min_index = j;

                }

            }
            if (min_index != i) {
                swap(nums, i, min_index);
            }

        }
    }

    static boolean primenum(int n){
        if(n <= 1) return false;

        if(n > 2 && n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n) ; i += 2) {
            if(n % i == 0){
                return false;
            }

        }
        return true;
    }

    static List<Integer> primeinGivenRange(int start,int end){
        List<Integer> ans = new ArrayList<>();

        for (int i = start; i <= end ; i++) {
            if(primenum(i)){
                ans.add(i);
            }

        }
        return ans;
    }



    static int primeCount(int n ){
        return primeinGivenRange(0,n).size();
    }

}