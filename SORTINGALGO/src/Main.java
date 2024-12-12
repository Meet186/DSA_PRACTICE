import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int arr [] = {8,11,40,7,8};
        String s [] = {"b","z","c","a"};

        mergeSort(arr,0,4);
        for(int e : arr){
            System.out.print(e + " ");
        }




    }


   static void bubbleSort(int arr []){
        int n = arr.length;

       for (int i = 0; i < n; i++) {
           boolean falg = false;
           for (int j = 0; j < n-i-1; j++) {
               if(arr[j] > arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                   falg = true;
               }
           }

           if(!falg){
               return;
           }
       }
   }

    static void bubbleSortString(String arr []){
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean falg = false;
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j].compareTo(arr[j+1]) >0 ){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    falg = true;
                }
            }

            if(!falg){
                return;
            }
        }
    }


   static void selectionSort(int arr []){
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

    static void selectionSortString(String arr []){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min_index = i;
            for (int j = i+1; j <n ; j++) {
                if(arr[j].compareTo(arr[min_index]) < 0 ){
                    min_index = j;
                }

            }
            if(min_index != i){
                String temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;
            }

        }
    }

   static void insertionSort(int arr []){
        int n = arr.length;
       for (int i = 1; i <n ; i++) {
           int j = i;
           while (j > 0 && arr[j] < arr[j-1]){
               int temp = arr[j];
               arr[j] =  arr[j-1];
               arr[j-1] = temp;
               j--;
           }

       }
   }


   static void mergeSort(int nums [] , int l, int r){
        if(l >= r){
            return;
        }
        int mid = l + (r-l)/2;
        mergeSort(nums,l,mid);
        mergeSort(nums,mid+1,r);
        merge(nums,l,mid,r);
   }

   static void merge(int nums [], int l, int mid ,int r){
        int merged [] = new int[r-l+1];
        int idx1 = l;
        int idx2 = mid+1;
        int x = 0;
        while (idx1 <= mid && idx2 <= r){
            if(nums[idx1] <= nums[idx2]){
                merged[x++] = nums[idx1++];
            } else {
                merged[x++] = nums[idx2++];
            }
        }
        while (idx1 <= mid){
            merged[x++] = nums[idx1++];
        }
        while (idx2 <= r){
            merged[x++] = nums[idx2++];
        }
       for (int i = 0, j=l; i <merged.length ; i++,j++) {
           nums[j] = merged[i];
       }
   }


























}