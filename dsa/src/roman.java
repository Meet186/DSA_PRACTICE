public class roman {
    public static void main(String[] args) {

       String ans = integerToRoman(3749);
        System.out.println(ans);




    }

    static int romanToInteger(String romanNumber){
        int sum = 0;
        int n = romanNumber.length();
        for (int i = 0; i < n; i++) {
            char currentChar = romanNumber.charAt(i);
           if((i+1 < n) && getVal(currentChar) < getVal(romanNumber.charAt(i+1))){
               sum -= getVal(currentChar);
           } else {
               sum += getVal(currentChar);
           }

        }
        return sum;
    }
    static int getVal(char ch){
        switch (ch){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default:return 0;
        }
    }
    static String integerToRoman(int number){
        int val [] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String sym [] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        String result = "";
        for (int i = 0; i < 13; i++) {
            if(number == 0){
                break;
            }
            int times = number/val[i];
            while (times > 0){
                result += sym[i];
                times--;
            }
            number = number%val[i];
        }
        return result;
    }
}
