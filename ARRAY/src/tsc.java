public class tsc {

    static void printArray(int arr []){
        for(int el : arr){
            System.out.print(el + " ");
        }
    }

    static void sortArray(int arr []){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }



        }
        reverseArray(arr);
    }

    static void reverseArray(int []arr){
        int n = arr.length;
        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;

        }
    }

    public static void main(String[] args) {
        int arr [] = {1,5,7,4,8,1,0};
        sortArray(arr);
        printArray(arr);
    }
}
