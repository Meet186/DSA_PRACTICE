public class countSort {
    public static void main(String[] args) {

    }
    static void countSort(int arr []){
        int max = findMax(arr);
        int cout [] = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            cout[arr[i]]++;
        }

        int k = 0;
        for (int i = 0; i < cout.length; i++) {
            for (int j = 0; j < cout[i]; j++) {
                arr[k++] = i;

            }

        }
    }

    static void countSortStable(int arr []){
        int n = arr.length;
        int output [] = new int[n];

        int max = findMax(arr);
        int count [] = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        for (int i = 1; i < count.length ; i++) {
            count[i] += count[i-1];
        }

        for (int i = n-1; i >= 0 ; i--) {
            int index = count[arr[i]] - 1;
            output[index] = arr[i];
            count[arr[i]]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    static int findMax(int arr []){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
