import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class practice {
    public static void main(String[] args) {
        int arr [] = {4,7,8,9,1,2,0,3};
        redixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int arr[]){
        // TC - O(N*N)
        // SC - O(1)
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] >= arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
    }

    static void selectionSort(int arr []){
        // TC - O(N * N)
        // SC - O(1)
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min_index = i;
            for (int j = i+1; j <n ; j++) {
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            if(min_index != i){
                int temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;
            }

        }
    }

    static void insertationSort(int arr []){
        // TC - O(N * N)
        // SC - O(1)
        int n = arr.length;
        for (int i = 1; i <n ; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }

        }
    }

    static void mergeSort(int arr[], int startIdx,int endIdx ){
        // TC - O(NlogN)
        // SC - O(N)
        if(startIdx >= endIdx){
            return;
        }
        int middleIdx = startIdx + (endIdx-startIdx)/2;
        mergeSort(arr,startIdx,middleIdx); // TC - O(logN)
        mergeSort(arr,middleIdx + 1,endIdx); // TC - O(logN)
        merge(arr,startIdx,middleIdx,endIdx);
    }

    static void merge(int arr [],int startIdx,int middleIsx,int endIdx ){
        int n1 = middleIsx - startIdx + 1;
        int n2 = endIdx-middleIsx;

        int L[] = new int[n1]; //  SC - O(N)
        int R[] = new int[n2]; // SC - O(N)

        int i=0;
        int j=0;
        for(i=0;i<n1;i++) L[i] = arr[startIdx + i]; // TC - O(N)
        for(j=0;j<n2;j++) R[j] = arr[middleIsx + 1 + j]; // TC O(N)
        i=0;
        j=0;
        int k = startIdx;
        while (i < n1 && j < n2 ){
            if(L[i] <= R[j]){
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        while (i < n1){
            arr[k++] = L[i++];
        }
        while (j < n2){
            arr[k++] = R[j++];
        }
    }

    static void quickSort(int arr [], int si, int ei){
        // TC - O(N*N) wrost Case
        // TC - O(NlogN) avg & best Case
        
        if(si >= ei){
            return;
        }
        int pi = partation(arr,si,ei);
        quickSort(arr,si,pi-1);
        quickSort(arr,pi + 1, ei);

    }

    static int partation(int arr [], int si,int ei){
        
        int piviot = arr[si];
        int count = 0;
        for (int i = si + 1; i <= ei; i++) {
            if(arr[i] <= piviot){
                count++;
            }
        }
        int piviotIndex = si + count;
        int temp = arr[si];
        arr[si] = arr[piviotIndex];
        arr[piviotIndex] = temp;

        int i = si;
        int j = ei;

        while (i < piviotIndex && j > piviotIndex){
            while (arr[i] <= piviot) i++;
            while (arr[j] > piviot) j--;

            if(i < piviotIndex && j > piviotIndex){
               int temp1 = arr[i];
               arr[i] = arr[j];
               arr[j] = temp1;
            }
        }
        return piviotIndex;
    }

    static void countSort(int arr []){
        int max = maxNum(arr);
        int output [] = new int[arr.length];
        int count [] = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        for (int i = 1; i < count.length ; i++) {
            count[i] += count[i-1];
        }
        for (int i = arr.length-1; i >= 0; i--) {
            int countIndex = count[arr[i]] - 1;
            output[countIndex] = arr[i];
            count[arr[i]]--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];

        }
    }

    static void redixSort(int arr []){
        int max = maxNum(arr);


        for (int placed = 1; max/placed > 0 ; placed *= 10) {
            count(arr,placed);
        }
    }

    static void count(int arr[],int placeed){
        int n = arr.length;
        int out[] = new int[n];
        int count [] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            count[(arr[i]/placeed)%10]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i-1];
        }
        for (int i = n-1; i >= 0 ; i--) {
            int index = count[(arr[i]/placeed)%10] - 1;
            out[index] = arr[i];
            count[(arr[i]/placeed)%10]--;
        }
        for (int i = 0; i <n ; i++) {
            arr[i] = out[i];

        }
    }

    static void bucketSort(float arr []){
        int n = arr.length;
        ArrayList<Float> bucket [] = new ArrayList[n];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) arr[i] * 10;
            bucket[bucketIndex].add(arr[i]);
        }
        for (int i = 0; i < bucket.length; i++) {
            Collections.sort(bucket[i]);
        }
        int index = 0;
        for (int i = 0; i < bucket.length; i++) {
            for(float el : bucket[i]){

                arr[index++] = el;
            }

        }
    }
    
    static int maxNum(int arr []){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            
        }
        return max;
    }

}

