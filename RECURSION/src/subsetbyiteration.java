import java.util.ArrayList;
import java.util.List;

public class subsetbyiteration {
    public static void main(String[] args) {
        int arr [] = {1,2,3};
        List<List<Integer>> ans = subset(arr);
        System.out.println(ans);
    }

    static List<List<Integer>> subset(int nums []){
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for(int num : nums){
            int n = result.size();
            for (int i = 0; i < n; i++) {
                List<Integer> temp = new ArrayList<>(result.get(i));
                temp.add(num);
                result.add(temp);


            }
        }

        return result;

    }



}
