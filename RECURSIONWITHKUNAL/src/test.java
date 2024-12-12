import java.util.ArrayList;

public class test {

    static ArrayList<Integer> target(int arr[], int target, int index){
        ArrayList<Integer> result = new ArrayList<>();
        return helper(arr,target,index,result);
    }
    static ArrayList<Integer> helper(int arr [], int target,int index,ArrayList<Integer> result){
        if(index == arr.length){
            return result;
        }
        if(arr[index] == target){
            result.add(index);
        }
        return helper(arr,target,index+1,result);
    }



    static void reverse(int arr [], int left, int rigth){
        if(left >= rigth) return;
        int temp = arr[left];
        arr[left] = arr[rigth];
        arr[rigth] = temp;

        reverse(arr, left+1, rigth-1);
    }

    static int [] reverseArray(int arr[]){
        if(arr.length == 0 || arr == null) return arr;
        reverse(arr,0, arr.length-1);
        return arr;
    }


    static void plusOne(int arr []){
       helperplusone(arr,1);
    }

    static void helperplusone(int arr[], int index){
        if(index == arr.length){
            return;
        }
        arr[index] += arr[index-1];
        helperplusone(arr,index+1);
    }



    public static void main(String[] args) {
         int arr [] = {1,2,3,9};
         plusOne(arr);
         for(int wl : arr){
             System.out.print(wl + " ");
         }


    }
}
