import java.util.ArrayList;
public class subset {
    static void removeA(String s, String c){
        if(s.isEmpty()){
            System.out.println(c);
            return;
        }
        char ch = s.charAt(0);
        if(ch == 'a'){
            removeA(s.substring(1),c);
        } else {
            removeA(s.substring(1),ch+c);
        }
    }
    static ArrayList<String> getssq(String s){
        ArrayList<String> ans = new ArrayList<>();
        if(s.length() == 0){
            ans.add("");
            return ans;
        }
        char current = s.charAt(0);
        ArrayList<String> smallAns = getssq(s.substring(1));
        for(String ss : smallAns){
            ans.add(ss) ;
            ans.add(current + ss);
        }
        return ans;
    }
    static void subSet2(String s,String currAns){
        if(s.length() == 0){
            System.out.println(currAns);
            return;
        }
        char currchar = s.charAt(0);
        String remString = s.substring(1);
        subSet2(remString,currchar+currAns);
        subSet2(remString,currAns);
    }
    static ArrayList<String> subsetArray(String s,String currAns){
        if(s.length() == 0){
             ArrayList<String> list = new ArrayList<>();
             list.add(currAns);
             return list;
        }
        char currchar = s.charAt(0);
        String remString = s.substring(1);
        ArrayList<String> left =  subsetArray(remString,currchar+currAns);
        ArrayList<String> rigth = subsetArray(remString,currAns);

        left.addAll(rigth);
        return left;
    }



    static void sumOfSubSet(int arr [], int n , int index, int sum){
        if(index >= n){
            System.out.println(sum);
            return;
        }
        // include
        sumOfSubSet(arr,n,index+1,sum+arr[index]);
        // exclude
        sumOfSubSet(arr,n,index+1,sum);

    }

    public static void main(String[] args) {
         int arr [] = {3,1};
         ArrayList<String> ans = getssq("abc");
        System.out.println(ans);

    }
}
