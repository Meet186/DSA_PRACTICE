import java.util.ArrayList;

public class keypadcombination
{

    static void keypadCombination(String digit, String kp [], String res )
    {
//        Time Complexity: O(4^n)
//        Space Complexity : O(N)


        if(digit.length() == 0){
            System.out.print(res + " ");
            return;
        }
        int currNum = digit.charAt(0)-'0';
        String currChoice = kp[currNum];

        for (int i = 0; i < currChoice.length(); i++) {
            keypadCombination(digit.substring(1),kp,res+currChoice.charAt(i));
        }
    }

    static ArrayList<String> keypadCombination2(String digit, String kp [], String res){
        ArrayList<String> result = new ArrayList<>();
        helper(digit,kp,res,result);
        return result;
    }

    static void helper(String digit, String kp [], String res, ArrayList<String> result){
        if(digit.length() == 0){
            result.add(res);
            return;
        }
        int currNum = digit.charAt(0)-'0';
        String currChoice = kp[currNum];

        for (int i = 0; i < currChoice.length(); i++) {
            helper(digit.substring(1),kp,res+currChoice.charAt(i),result);
        }
    }


    public static void main(String[] args) {
        String kp [] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String  digit = "23";
        keypadCombination(digit,kp,"");


    }
}
