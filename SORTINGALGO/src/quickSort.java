import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int arr [] = {4,8,7,9,0};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int arr [],int st,int end){
        // TC - (Wrost Case) - O(N*N) SC- O(N)
        // TC - (Average Case) - O(NlogN) SC - O(logN)
        // TC - ( Best Case) - O(NlogN) SC - O(logN)
        if(st >= end){
            return;
        }
        int pi = partition(arr,st,end);
        quickSort(arr, st, pi-1);
        quickSort(arr,pi + 1 ,end);

    }

    static int partition(int arr [], int st, int end){
        int pivont  = arr[st];
        int cnt = 0;
        for (int i = st + 1; i <= end ; i++) {
            if(arr[i] <= pivont){
                cnt++;
            }
        }
        int piviotidx = st + cnt;
        swap(arr,st,piviotidx);
        int i=st,j=end;
        while (i < piviotidx && j > piviotidx){
            while (arr[i] <= pivont) i++;
            while (arr[j] > pivont) j--;
            if(i < piviotidx && j > piviotidx){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return piviotidx;
    }


    static void swap(int arr [], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
