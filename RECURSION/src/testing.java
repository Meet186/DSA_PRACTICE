import java.util.ArrayList;

public class testing {

    static String integerToRoman(int number){
        int val [] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String sym [] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String result = "";
        for (int i = 0; i < val.length; i++) {
            if(number == 0){
              break;
            }
            int times = number/val[i];
            while (times > 0){
                result += sym[i];
                times--;
            }
            number = number % val[i];

        }
        return result;
    }


    public static void main(String[] args) {
       String ans = integerToRoman(800);
        System.out.println(ans);

    }
}
