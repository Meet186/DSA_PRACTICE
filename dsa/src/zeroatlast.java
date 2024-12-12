import java.util.Arrays;

public class zeroatlast {



    static int [] zeroAtLast(int [] arr){
        Arrays.sort(arr);
        int indx = 0;
        int temp[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                temp[indx++] = arr[i];
            }

        }

        return temp;
    }

    static void printArray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
    public static void main(String[] args) {
        int arr [] = {1,4,5,0,8,0,7};
        int ans [] = zeroAtLast(arr);
        printArray(ans);
    }
}
