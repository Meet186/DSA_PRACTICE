import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class
AllSortingAlgo {
    public static void main(String[] args) {
        int arr [] = {3,16,8,4,2};
        int arr1 [] = {789,459,123,470,124};
        redixSort(arr1);
        boolean ans = bitcountSort(arr);
        System.out.println(ans);


    }

    static void bubleSort(int arr []){
        // TC - O(N*N)
        // SC - O(1)

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                return;
            }

        }
    }

    static void selectionSort(int arr []){
        // TC - O(N*N)
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
        // TC - O(N*N)
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

    static void mergeSort(int arr[], int startIndex, int endIndex){
        // TC - O(NlogN)
        // SC - O(N)
        if(startIndex >= endIndex){
            return;
        }
        int middleIndex = startIndex + (endIndex-startIndex)/2;
        mergeSort(arr,startIndex,middleIndex); // TC - O(NlogN)
        mergeSort(arr,middleIndex + 1 ,endIndex);// TC - O(NlogN)
        merge(arr,startIndex,middleIndex,endIndex); // TC - O(N)
    }

    static void merge(int arr [], int startIndex, int middleIndex, int endIndex){
        // TC - O(N)
        int n1 = middleIndex - startIndex + 1;
        int n2 = endIndex - middleIndex;

        int L[] = new int[n1]; // SC - O(N)
        int R[] = new int[n2];  // SC - O(N)

        for (int i = 0; i < n1; i++) {
            L[i] = arr[startIndex + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[middleIndex + 1 + j];
        }

        int l = 0 , m=0;
        int k = startIndex;
        while (l < n1 && m < n2){
            // SC - O(1)
            if(L[l] <= R[m]){
                arr[k++] = L[l++];
            } else {
                arr[k++] = R[m++];
            }
        }

        while (l < n1){
            // SC - O(1)
            arr[k++] = L[l++];
        }
        while (m < n2){
            // SC - O(1)
            arr[k++] = R[m++];
        }

    }

    static void quickSort(int arr [], int si, int ei){
        // TC - O(NlogN) SC - O(logN) average case
        // TC - O(N*N)  SC - O(N) wrost case

        if(si >= ei){
            return;
        }
        int pi = partation(arr,si,ei);
        quickSort(arr,si,pi-1); // TC - O(logN)
        quickSort(arr,pi + 1, ei); // TC - O(logN)
    }

    static int partation(int arr[], int si, int ei){
        int piviot = arr[si];
        int count = 0;
        for (int i = si + 1; i <= ei ; i++) {
            // TC - O(N)
            if(arr[i] <= piviot){
                count++;
            }
        }
        int piviotIndex = si + count;
        swap(arr,si,piviotIndex);

        int i = si;
        int j = ei;

        while (i < piviotIndex && j > piviotIndex){
            while (arr[i] <= piviot) i++;
            while (arr[j] > piviot) j--;

            if(i < piviotIndex && j > piviotIndex){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return piviotIndex;
    }

    static void countSort(int arr []){
        // TC - O(N + K) All case
        // SC - O(K)
        int outPut [] = new int[arr.length]; // SC- O(N)
        int max = largestEl(arr);
        int count [] = new int[max + 1]; // SC - O(k)

        // Make count as frequency array
        for (int i = 0; i < arr.length; i++) { // TC - O(N)
            count[arr[i]]++;
        }
        // Make prefix-Sum of count
        for (int i = 1; i < count.length ; i++) {
            count[i] += count[i-1];
        }
        // Take element from array and find index in prefix-sum of count .
        // (loop from last element to fix the last accurance of element)
        for (int i = arr.length - 1; i >= 0; i--) { // TC - O(K)
            int countindex = count[arr[i]] - 1;
            outPut[countindex] = arr[i];
            // decreass the value
            count[arr[i]]--;
        }
        // Change the original array
        for (int i = 0; i < arr.length; i++) { // TC - O(N)
            arr[i] = outPut[i];
        }
    }
    static void redixSort(int arr []){
        // TC - O(dN) D = MAX NUMBER OF DIGIT PRESENT IN ARRAY
        int max = largestEl(arr);
        for (int place = 1; max/place > 0 ; place *= 10) {
            count(arr,place);
        }
    }
    static void count(int arr [], int place){
        // TC - O(N);
        int n = arr.length;
        int output [] = new int[n]; // SC - O(N)
        int count [] = new int[10]; // SC - O(10)

        for (int i = 0; i < arr.length; i++) {
            count[(arr[i]/place)%10]++; // TC - O(N)
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i-1];
        }

        for (int i = n-1; i >=0 ; i--) {
            int index = count[(arr[i]/place)%10] - 1;
            output[index] = arr[i];
            count[(arr[i]/place)%10]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];

        }

    }

    static void bucketSort(int arr []){
        int n = arr.length;
        int max = largestEl(arr);
        ArrayList<Integer> bucket [] = new ArrayList[max + 1];

        for (int i = 0; i <= max ; i++) {
            bucket[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            int bucketIndex = arr[i];
            bucket[bucketIndex].add(arr[i]);
        }
        int index = 0;
        for (int i = 0; i <= max; i++) {
            for(int el : bucket[i]){
                arr[index++] = el;
            }
        }

    }

    static void floatBucket(float arr []){
        int n = arr.length;
        ArrayList<Float> bucket [] = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            bucket[i] = new ArrayList<Float>();
        }
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) arr[i] * 10;
            bucket[bucketIndex].add(arr[i]);
        }
        for (int i = 0; i < bucket.length; i++) {
            Collections.sort(bucket[i]);
        }
        int index = 0;
        for (int i = 0; i < n; i++) {
            for(float el : bucket[i]){
                arr[index++] = el;
            }

        }
    }


    // HELPER - METHODS

    static int largestEl(int arr []){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


    static void threePointerSort(int arr []){
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high){
            if(arr[mid] == 0){
                swap(arr,mid,low);
                low++;
                mid++;
            } else if (arr[mid] == 2) {
                swap(arr,mid,high);
                high--;
            } else {
                mid++;
            }

        }
    }

    static void swap2(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static void swap(int arr [],int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static boolean bitcountSort(int arr []){
        int n = arr.length;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            flag = false;
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j] <= arr[j+1]){
                    // no need to sort..
                    continue;
                } else {
                    if(Integer.bitCount(arr[j]) == Integer.bitCount(arr[j+1])){
                        // we can swap n-times elements..
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        flag = true;
                    } else {
                        return false;
                    }
                }

            }

            if(!flag){
                break;
            }
        }
        return true;

    }

}
