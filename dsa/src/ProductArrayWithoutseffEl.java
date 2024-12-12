import java.util.Arrays;

public class ProductArrayWithoutseffEl {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        int ans [] = productArray2(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int [] productArray(int arr []){
        // TC - O(N)
        // SC - O(N)
        int n = arr.length;
        int leftPr [] = new int[n];
        int rightPr [] = new int[n];
        int result [] = new int[n];

        // left product
        leftPr[0] = 1;
        for (int i = 1; i < leftPr.length; i++) {
            leftPr[i] = leftPr[i - 1] * arr [i - 1];
        }
        // right product
        rightPr[n-1] = 1;
        for (int i = n-2; i >=0 ; i--) {
            rightPr[i] = rightPr[i + 1] * arr[i + 1];
        }
        for (int i = 0; i < n; i++) {
            result[i]  = leftPr[i] * rightPr[i];
        }
        return result;
    }

    static int [] productArray2(int arr []){
        // TC - O(N)
        // SC - O(1)
        int n = arr.length;
        int res [] = new int[n];
        int productOfAllBeforeCurrent = 1;
        int productOfAllAfterCurrent = 1;

        for (int i = 0; i < n; i++) {
            res[i] = productOfAllBeforeCurrent;
            productOfAllBeforeCurrent  *= arr[i];
        }
        for (int i = n-1; i >=0 ; i--) {
            res[i] *= productOfAllAfterCurrent;
            productOfAllAfterCurrent *= arr[i];
        }
        return res;

    }
}
