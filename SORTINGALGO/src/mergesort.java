public class mergesort {
    public static void main(String[] args) {
        int arr [] = {1,7,8,9,4,77};
        mergeSort(arr,0,5);
        for(int el : arr){
            System.out.print(el + " ");
        }
    }

    static void mergeSort(int nums [], int start, int end){
        if(start >= end){
            return;
        }
        int mid = start + (end-start)/2;
        mergeSort(nums,start,mid);
        mergeSort(nums,mid+1,end);
        merge(nums,start,mid,end);

    }

    static void merge(int nums [], int start, int mid, int end) {
        int merged[] = new int[end - start + 1];
        int index1 = start;
        int index2 = mid + 1;
        int x = 0;
        while (index1 <= mid && index2 <= end) {
            if (nums[index1] <= nums[index2]) {
                merged[x++] = nums[index1++];
            } else {
                merged[x++] = nums[index2++];
            }
        }

        while (index1 <= mid){
            merged[x++] = nums[index1++];
        }
        while (index2 <= end){
            merged[x++] = nums[index2++];
        }

        for (int i = 0 , j = start; i < merged.length; i++,j++) {
            nums[j] = merged[i];

        }
    }
}
