import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayisSubsetorNot {
    public static void main(String[] args) {
        int arr1 [] = {11,12,13,14,15,18,20};
        int arr2 [] = {13,14,18,20};
        boolean ans = isSubsetByPointer(arr1,arr2);
        System.out.println(ans);
    }

    static List<int[]> subArray(int[] arr){
        List<int[]> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length+1 ; j++) {
                int[] set = Arrays.copyOfRange(arr,i,j);
                ans.add(set);
            }

        }
        return ans;
    }


    static boolean isSubset(int arr1[],int arr2[]){
        // TC - O(N * N)
        // SC - O(1)
        for (int i = 0; i < arr2.length; i++) {
            boolean falg = false;
            for (int j = 0; j < arr1.length; j++) {
                if(arr2[i] == arr1[j]){
                    falg = true;
                    break;
                }
            }
            if(!falg){
                return false;
            }
        }
        return true;
    }

    static boolean isSubset2(int arr1 [], int arr2[]){
        // TC - O(NlogN)
        Arrays.sort(arr1);
        for(int el : arr2){ // O(N)
            if(binarySerch(arr1,el) < 0){ // O(logN)
                return false;
            }
        }
        return true;
    }

    static int binarySerch(int arr [], int key){
        // TC - O(logN)
        int si = 0;
        int ei = arr.length-1;

        while (si <= ei){
            int mid = si + (ei-si)/2;
            if(key == arr[mid]){
                return mid;
            } else if (key < arr[mid]) {
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }
        return -1;
    }

    static boolean isSubsetByPointer(int arr1[], int arr2[]){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length){
            if(arr2[j] == arr1[i]){
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                return false;
            }
        }
        return j == arr2.length;
    }
}
