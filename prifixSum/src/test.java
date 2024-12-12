public class test {

    static void printArray(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

    static int [] changeArrayByK(int arr [] , int k){
        int n = arr.length;
        int ans [] = new int[n];
        int d = 0;
        for (int i = k; i <=n-1 ; i++) {
            ans[d++] = arr[i];
        }
        for (int i = 0; i <k ; i++) {
            ans[d++] = arr[i];

        }
        return ans;
    }

    static void swap(int [] arr , int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

    }

    static void revverseArray(int arr [],int i,int j){
        while (i < j){
            swap(arr,i,j);
            i++;
            j--;
        }

    }

    static int [] rotateArray(int [] arr , int k){
        int n = arr.length;
        k = k%n;

        revverseArray(arr,0,k-1);
        revverseArray(arr,k,n-1);
        revverseArray(arr,0,n-1);
        return arr;
    }
    public  void main(String[] args) {
        int arr [] = {1,2,3,4,5};

        rotateArray(arr,2);
        printArray(arr);
    }
}

class methods {
    public void printArray(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

    public int[] prifixSum(int[] arr) {
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + arr[i];

        }
        return pref;
    }


}