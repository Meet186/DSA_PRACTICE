public class uniqueElinsortedarray {
    public static void main(String[] args) {
        int arr [] = {1,1,2,2,3,3,4,5,5,6,6,7,7,8,8,9,9};
    }
    static int findUniqueElInSortedArray(int arr []){
        int si = 0;
        int ei = arr.length - 1;

        while (si < ei){
            int mid = si + (ei-si)/2;
            boolean isEven = (ei-mid) % 2 == 0 ? true : false;

            if(arr[mid] == arr[mid + 1]){
                if(isEven){
                    si = mid + 2;
                } else {
                    ei = mid - 1;
                }
            } else {
                if(isEven){
                    ei = mid;
                } else {
                    si = mid + 1;
                }
            }

        }

        return arr[ei];

    }
}
