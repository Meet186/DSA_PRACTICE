import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void rateInMaze2direction(int r , int c){
        helper(r,c,"");
    }

    static void helper(int r,int c,String s ){
       if(r < 1 || c < 1) return;
       if(r == 1 && c == 1){
           System.out.println(s);
           return;
       }
       // go down
       helper(r-1,c,s+"D");
       // go right
       helper(r,c-1,s+"R");

    }

    static List<List<Integer>> subset(int nums[]){
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());

        for(int num : nums){
            int n = ans.size();
            for (int i = 0; i < n; i++) {
                List<Integer> temp = new ArrayList<>(ans.get(i));
                temp.add(num);
                ans.add(temp);

            }
        }
        return ans;
    }

    static List<List<Integer>> permutation(int nums []){
        List<List<Integer>> ans = new ArrayList<>();
        help(nums,0,ans);
        return ans;
    }

    private static void help(int[] nums, int index, List<List<Integer>> ans) {
        if(index == nums.length-1){
            List<Integer> ll = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                ll.add(nums[i]);


            }
            ans.add(ll);
            return;
        }
        for (int i = index; i < nums.length ; i++) {
            swap(nums,i,index);
            help(nums,index + 1,ans);
            swap(nums,i,index);

        }


    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public static void main(String[] args) {
        int n [] = {1,2,3,4

        };
        List<List<Integer>> ans = permutation(n);
        System.out.println(ans);


    }
}