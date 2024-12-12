public class question {
    public static void main(String[] args) {
        int arr [] = {1,5,5,5,7,8,9,11,11,15,15};
        int ans = kthTargetEl(arr,1);
        System.out.println(ans);
    }

    // find the first accurance of a given element in {SORTED - ARRAY}

    static int findFirstAccurance(int arr [],int accurance){
        int si = 0;
        int ei = arr.length-1;
        int ans = -1;
        while (si < ei){
            int mid = si + (ei-si)/2;

            if(accurance == arr[mid]){
                ans = mid;
                ei = mid-1;
            } else if (accurance  < arr[mid]) {
                ei = mid-1;
            } else {
                si = mid + 1;
            }
        }
        return ans;
    }

    static int lastAccurance(int arr [], int accurance){
        int si = 0;
        int ei = arr.length-1;
        int ans = -1;
        while (si <= ei){
            int mid = si + (ei-si)/2;
            if(accurance == arr[mid]){
                ans = mid;
                si = mid + 1;
            } else if (accurance < arr[mid]) {
                ei = mid - 1;

            } else {
                si = mid + 1;

            }
        }
        return ans;
    }

    // find the sqrt of the given num;


    static int findSqrt(int x){
        int si = 0;
        int ei = x;
        int ans = 0;

        while (si <= ei){
            int mid = si + (ei-si)/2;

            if(mid * mid == x){
                return mid;
            } else if (mid * mid > x){
                ei = mid - 1;
            } else {
                si = mid + 1;
                ans = mid;

            }
        }
        return ans;
    }

    // Find KthTarget el

    static int kthTargetEl(int arr [],int target) {
        int si = 0;
        int ei = arr.length - 1;
        int n = arr.length - 1;

        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < arr[n]) {
                if (target > arr[mid] && target <= arr[ei]) {
                    si = mid + 1;
                } else {
                    ei = mid - 1;
                }

            } else {
                if (target >= arr[si] && target < arr[mid]) {
                    ei = mid - 1;
                } else {
                    si = mid + 1;
                }
            }

        }
        return -1;

    }

    static int targetElDuplicate(int arr [],int target){
        int n = arr.length-1;
        int si = 0;
        int ei = arr.length-1;

        while (si <= ei){
            int mid = si + (ei-si)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[si] == arr[mid] && arr[ei] == arr[mid]) {
                si++;
                ei--;

            } else if (arr[mid] <= arr[n]) {
                if(target > arr[mid] && target <= arr[n]){
                    si = mid + 1;
                } else {
                    ei = mid-1;
                }
            } else {
                if(target >= arr[si] && target < arr[mid]){
                    ei = mid-1;
                } else {
                    si = mid + 1;
                }
            }
        }
        return -1;
    }

    static int findTarget(int arr [][], int target){
        // TC - O(NlogN)
        for(int el [] : arr){
            int si = 0;
            int ei = el.length-1;
            while (si <= ei){
                int mid = si + (ei-si)/2;
                if(target == el[mid]){
                    return mid;
                } else if (target < el[mid]) {
                    ei = mid - 1;
                } else {
                    si = mid + 1;
                }

            }
        }
        return -1;
    }

    static boolean findTarget2(int arr [][], int target){
        int n = arr.length;
        int m = arr[0].length;
        int st = 0;
        int end = (n*m)-1;
        while (st <= end){
            int mid = st + (end-st)/2;
            int midEl = arr[mid/m][mid%m];
            if(midEl == target){
                return true;
            }
            else if (target < midEl) {
                end = mid - 1;
            } else {
                st = mid + 1;

            }
        }
        return false;
    }


    static boolean findTarget3(int arr [][], int target){
        int n = arr.length;
        int m = arr[0].length;
        int i = 0, j = m-1;

        while (i < n && j>= 0){
            if( target == arr[i][j] ) return true;
            else if (target  < arr[i][j]  ) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

    static int findPickElementInMountainArray(int arr []){
        int si = 0;
        int ei = arr.length-1;
        int ans = -1;

        while (si <= ei){
            int mid = si + (ei-si)/2;
            if(arr[mid] < arr[mid+1]){
                ans = mid + 1;
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }
        return ans;
    }
    static int findPickElII(int arr []){
        // TC - O(logN)
        // SC - O(1)
        int si = 0;
        int ei = arr.length-1;
        int n = arr.length;

        while (si <= ei){
            int mid = si + (ei-si)/2;
            if( arr[mid] == 0 || arr[mid] > arr[mid-1] && arr[mid] == n-1 || arr[mid] > arr[mid + 1]){
                return mid;
            } else if (arr[mid] < arr[mid + 1]) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }

        }
        return -1;
    }

    static int findMinumimElementINRotatedArray(int arr []){
        int n = arr.length-1;
        int si = 0;
        int ei = arr.length-1;
        int ans = -1;
        while (si <= ei){
            int mid = si + (ei-si)/2;
            if(arr[mid] < arr[n]){
                ans = arr[mid];
                ei = mid - 1;

            } else {
                si = mid + 1;
            }
        }
        return ans;
    }


}
