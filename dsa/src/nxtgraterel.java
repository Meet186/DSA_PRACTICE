public class nxtgraterel {
    static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans [] = new int[nums1.length];
        boolean found = false;
        for(int i=0;i<nums1.length;i++){
            found = false;
            for(int j = 0; j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    found = true;
                }
                if(found && nums2[j] > nums1[i]){
                    ans[i] = nums2[j];
                    break;
                }
            }
        }
        for(int i=0;i<ans.length;i++){
            if(ans[i] == 0){
                ans[i] = -1;
            }
        }
        return ans;
    }

    static void printArray(int []arr){
        for(int el : arr){
            System.out.print(el + " ");
        }
    }
    public static void main(String[] args) {
        int num1 [] = {4,1,2};
        int nums2 [] = {1,3,4,2};
        int ans [] = nextGreaterElement(num1,nums2);
        printArray(ans);
    }
}
