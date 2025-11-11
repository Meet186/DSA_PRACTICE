package dubllyLinklist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class dubblylinklist {


    public static class Node{
        int val;
        int next;
        int prev;
         Node(int val){
             this.val = val;
         }


    }

    static int [] maxmincriticalpoint(int arr []){
        int minDistance = Integer.MAX_VALUE;
        int firstCriticalPoint = 0;
        int previousCriticalPoint = 0;
        int i = 1;
        while (i < arr.length - 1){
            if((arr[i] < arr[i-1] && arr[i] < arr[i+1]) ||
               (arr[i] > arr[i-1] && arr[i] > arr[i+1])
              ) {
                if(previousCriticalPoint == 0){
                    previousCriticalPoint = i;
                    firstCriticalPoint = i;
                } else{
                    minDistance = Math.min(minDistance, i-previousCriticalPoint);
                    previousCriticalPoint = i;
                }
            }
            i++;
        }
        if(minDistance == Integer.MAX_VALUE){
            return new int[] {-1,-1};
        }
        return new int[] {minDistance,previousCriticalPoint-firstCriticalPoint};
    }
    public static void main(String[] args) {
        int arr [] = {2,3,2,1,5,4,6};
        int ans [] = maxmincriticalpoint(arr);
        System.out.println(Arrays.toString(ans));
    }
}
