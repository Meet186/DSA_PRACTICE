//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int arr [] = {1,4,8,11,22,35,80,98,100};
        boolean ans = serch(arr,0, arr.length-1,4 );
        System.out.println(ans);

    }

    static boolean searchEl(int arr [] , int target) {
             // TC - O(logN)
             // SC - O(1)
        int st = 0;
        int end = arr.length - 1;

        while (st <= end){
            int mid = st + (end-st)/2;
           if(target == arr[mid]){
               return true;
           } else if (target > arr[mid]) {
               st = mid + 1;
           } else {
               end = mid - 1;
           }
        }
        return false;


    }

    static boolean serch(int arr [], int si, int ei, int target){
        // TC - O(logN)
        // SC - O(logN) {Due to stack }
        if(si >= ei){
            return false;
        }

            int mid = si + (ei-si)/2;
            if(target == arr[mid]){
                return true;
            } else {
                if(target < arr[mid]){
                    return serch(arr,si,mid-1,target);
                } else {
                    return serch(arr,mid + 1, ei,target);
                }
            }


    }

}