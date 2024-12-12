import java.util.ArrayList;
import java.util.List;

public class arrausubset {

   static ArrayList<ArrayList<Integer>> subset(int arr []){
       ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
       ans.add(new ArrayList<>());

       for(int el : arr){
           int n = ans.size();
           for (int i = 0; i < n; i++) {
               ArrayList<Integer> curr = new ArrayList<>(ans.get(i));
               curr.add(el);
               ans.add(curr);

           }
       }
       return ans;
   }
    public static void main(String[] args) {
       int arr [] = {1,2,3};
       ArrayList<ArrayList<Integer>> ans = subset(arr);
        System.out.println(ans);
    }
}
