import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class question2 {
    public static void main(String[] args) {
        int arr1 [] = {4,5,7,8,1,2,1,4};
        int arr2 [] = {7,8,4,1};
        Set<Integer> ans = intersection(arr1,arr2);
        System.out.println(ans);
    }

    static int serchTarget(int arr [], int target){
        int si = 0;
        int ei = arr.length-1;
        int ans = -1;
        while (si <= ei){
            int mid = si + (ei-si)/2;
            if(target == mid){
                return mid;
            } else if (target > arr[mid]) {
                ans = mid + 1;
                si = mid + 1;
            } else {
                ei = mid-1;
            }

        }
        return ans;
    }

    static int findMissingNum(int arr []){
        Arrays.sort(arr);
        int si = 0;
        int ei = arr.length-1;
        int ans = arr.length;

        while (si <= ei){
            int mid = si + (ei-si)/2;
            if(arr[mid] == mid){
                si = mid + 1;
            } else if (arr[mid] > mid) {
                ans = mid;
                ei = mid-1;
            } else {
                si = mid + 1;
            }
        }
        return ans ;
    }
    static int findMissing2(int arr []){
        int sum = arr.length * (arr.length+1)/2;
        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i];
        }
        return sum;
    }

    static Set<Integer> intersection(int arr1[],int arr2[]) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Set<Integer> result = new HashSet<>();

        for (int i = 0; i < arr2.length; i++) {
            if (isInArray(arr1, arr2[i])) {
                result.add(arr2[i]);
            }
        }
        return result;
    }

    static boolean isInArray(int arr[],int key){
        Arrays.sort(arr);
        int si = 0;
        int ei = arr.length-1;

        while (si <= ei){
            int mid = si + (ei-si)/2;
            if(arr[mid] == key) return true;
            else if (arr[mid] > key) {
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }

        return false;
    }

}
