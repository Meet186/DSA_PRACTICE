import java.util.Scanner;

public class test {

    public int [] prifixSum(int arr []){
        int n = arr.length;
        int pref [] = new int[n];
        pref[0] = arr[0];

        for (int i = 1; i <n ; i++) {
            pref[i] = pref[i-1] + arr[i];

        }
        return pref;
    }

    static int [] softArray(int [] arr){
        int n = arr.length;
        int ans [] = new int[n];
        int left = 0;
        int right = n-1;
        int k = 0;

        while (left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};


        int ans [] = softArray(arr);
        for(int el : ans){
            System.out.print(el + " ");
        }


    }

}
