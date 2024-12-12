import java.util.ArrayList;

public class Array {

    static boolean isSorted(int arr[]){
        return isSortedhelper(arr,0);
    }
    static boolean isSortedhelper(int arr [], int index){
        if(index == arr.length - 1){
            return true;
        }
        if(arr[index] > arr[index+1]) {
            return false;
        }
        return isSortedhelper(arr,index+1);
    }

    static int findTarget(int arr[],int target,int index){
        if(index == arr.length) return -1;
        if(arr[index] == target){
            return index;
        }
        return findTarget(arr,target,index+1);
    }

    static int minHight(int h []){
        return helper(h,h.length,0);
    }

    static int helper(int h [], int n , int index){
        if(index == n-1){
            return 0;
        }
       int p1 =  helper(h,n,index+1) + Math.abs(h[index]-h[index+1]);
        if(index == n-2) return p1;
        int p2 =  helper(h,n,index+2) + Math.abs(h[index]-h[index+2]);

        return Math.min(p1,p2);

    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllTarget(int arr[],int target,int index){
        if(index == arr.length) return;
        if(arr[index] == target){
            list.add(index);
        }
         findAllTarget(arr,target,index+1);
    }
    public static void main(String[] args) {
        int h [] = {10,40,30,20};
        int ans = minHight(h);
        System.out.println(ans);
    }
}
