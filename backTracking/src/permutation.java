import java.util.ArrayList;
import java.util.List;

public class permutation {

    static List<String> permutation(String s , String t) {
        List<String> ans = new ArrayList<>();
        List<String> small = new ArrayList<>();
        if(s.length() == 0) {
            ans.add(t);
            return ans;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String left = s.substring(0,i);
            String right = s.substring(i+1);
            String rem = left + right;
            small = permutation(rem,t+ch);
            ans.addAll(small);
        }


        return ans;

    }


    static List<List<Integer>> permutation01(int nums[]){
        List<List<Integer>> ans = new ArrayList<>();
        boolean isvalid[] = new boolean[nums.length];
        List<Integer> ds = new ArrayList<>();
        helper(nums,ds,isvalid,ans);
        return ans;
    }

    private static void helper(int[] nums, List<Integer> ds, boolean[] isvalid, List<List<Integer>> ans) {
        if(ds.size() == nums.length){
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < ds.size() ; i++) {
                list.add(ds.get(i));
            }
            ans.add(list);
        }
        for (int i = 0; i < nums.length; i++) {
            if(isvalid[i] == false){  // call lagaga
                ds.add(nums[i]);
                isvalid[i] = true;
                helper(nums,ds,isvalid,ans);
                isvalid[i] = false;
                ds.remove(ds.size()-1);
            }
        }
    }

    static List<List<Integer>> permutation2(int nums[]){
        List<List<Integer>> ans = new ArrayList<>();
        helper2(nums,0,ans);
        return ans;
    }

    private static void helper2(int[] nums, int index, List<List<Integer>> ans) {
        int n = nums.length;
        if(index == n-1){
            List<Integer> list = new ArrayList<>();
            for(int i=0; i < n; i++){
                list.add(nums[i]);

            }
            ans.add(list);
            return;
        }

        for (int i = index; i < n; i++) {
            swap(i,index,nums);
            helper2(nums,index + 1, ans);
            swap(i,index,nums);


        }
    }
     static void swap(int i,int j,int nums[]){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
     }

    public static void main(String[] args) {
       int arr [] = {1,2,3};
       List<List<Integer>> ans = permutation2(arr);
        System.out.println(ans);


    }
}
