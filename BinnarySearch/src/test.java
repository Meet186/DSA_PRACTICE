import com.sun.source.tree.BreakTree;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,2,2,2,1,2,3};





    }

    // Find minimum element in KhtRotated Array.

    static int minEl(int arr[]){
        int ans = -1;
        int si = 0;
        int ei = arr.length-1;
        int n = arr[arr.length-1];

        while (si <= ei){
            int mid = si + (ei-si)/2;
            if(arr[mid] > n){
                si = mid+1;
            } else if (arr[mid] <= n) {
                ans = mid;
                ei = mid-1;
            }
        }
        return ans;
    }

    static int maxEl(int arr []){
        int si = 0;
        int ei = arr.length-1;
        int n = arr.length-1;
        int ans = -1;
        while (si <= ei){
            int mid = si + (ei-si)/2;
            if(arr[mid] < arr[n]){
                ei = mid - 1;
            } else if (arr[mid] > arr[n]) {
                ans = mid;
                si = mid + 1;

            }
        }
        return ans;
    }

    // Find the target element index in rotated Array.


    static int targetEl(int arr [], int target){

        int k = minEl(arr);
        int si = 0;
        int ei = k-1;
        int ans = -1;

        while (si <= ei){
            int mid = si + (ei-si)/2;
            if(target == arr[mid]){
                ans = mid;
                return ans;
            } else if (target > arr[mid]) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }

        si = k;
        ei = arr.length-1;

        while (si <= ei){
            int mid = si + (ei-si)/2;
            if(target == arr[mid]){
                ans = mid;
                return ans;
            } else if (target > arr[mid]) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }

        return ans;
    }









}