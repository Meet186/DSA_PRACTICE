import java.util.*;

public class random {
    public static void main(String[] args) {
        int arr [] = {7,8,9,10,11,4,5,6};

    }

    static int findel(int arr[],int target){
        int si = 0;
        int ei = arr.length-1;
        int n = arr.length - 1;

        while (si <= ei){
            int mid = si + (ei-si)/2;
            if(target == arr[mid]) return mid;
            if(arr[mid] < arr[n]){
                if(target > arr[mid] && target <= arr[ei]){
                    si = mid + 1;
                } else  {
                    ei = mid - 1;

                }
            } else {
                if(target < arr[mid] && target >= arr[si]){
                    ei = mid-1;
                } else {
                    si = mid + 1;
                }
            }
        }
        return -1;
    }








}

