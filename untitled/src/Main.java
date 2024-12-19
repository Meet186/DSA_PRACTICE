import java.util.*;
public class Main {

    static List<List<Integer>> subset(int nums[]){
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        for(var num : nums){
            int n = ans.size();
            for (int i = 0; i < n; i++) {
                List<Integer> temp = new ArrayList<>(ans.get(i));
                temp.add(num);
                ans.add(temp);

            }
        }
        return ans;
    }

    public static void main(String[] args) {

 





    }

}

