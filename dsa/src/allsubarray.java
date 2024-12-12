

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public class allsubarray {
    public static void main(String[] args) {
        int arr[] = {3, 4, -7, 1, 3, 3, 1, -4};

    }
    static ArrayList<int[]> allSubArray(int arr[], int target) {
        // TC - O(N*N)
        ArrayList<int[]> ans = new ArrayList<>();
        for (int start = 0; start < arr.length; start++) {
            int currsum = 0;
            for (int end = start; end < arr.length; end++) {
                currsum += arr[end];
                if (currsum == target) {
                    if(currsum < 0){
                        currsum = 0;
                    }
                    int sub[] = Arrays.copyOfRange(arr, start, end + 1);
                    ans.add(sub);
                }

            }

        }
        return ans;
    }
}
