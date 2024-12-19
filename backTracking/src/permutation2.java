import java.util.ArrayList;
import java.util.List;

public class permutation2 {


    static List<List<Integer>> permutation(int nums[]){
        // TC - O(n! * n)
        // SC - O(N)
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean isValid[] = new boolean[nums.length];
        helper(nums,ds,isValid,ans);
        return ans;
    }

    static void helper(int nums[],List<Integer>ds,boolean isValid[],List<List<Integer>> ans ){
        if(ds.size() == nums.length){
            List<Integer> ll = new ArrayList<>();
            for(int i=0; i < ds.size(); i++){
                ll.add(ds.get(i));
            }
            ans.add(ll);
        }
        for(int i=0; i < nums.length; i++){
            if(isValid[i] == false){
                ds.add(nums[i]);
                isValid[i] = true;
                helper(nums,ds,isValid,ans);
                isValid[i] = false;
                ds.remove(ds.size()-1);
            }
        }
    }

    static List<List<Integer>> permutation2(int nums[]){
        List<List<Integer>> ans = new ArrayList<>();
        helper2(nums,0,ans);
        return ans;
    }

    static void helper2(int nums[],int index , List<List<Integer>> ans ){
        if(index == nums.length-1){
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                list.add(nums[i]);
            }
            ans.add(list);
        }

        for (int i = index; i < nums.length ; i++) {
            swap(i,index,nums);
            helper2(nums,index+1,ans);
            swap(i,index,nums);

        }

    }

    static void swap(int i,int j , int nums[]){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int nusm [] = {1,2,314,5,12};
        List<List<Integer>> ans = permutation2(nusm);
        System.out.println(ans);
    }
}
