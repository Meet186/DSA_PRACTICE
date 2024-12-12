public class addbinary {
    public static void main(String[] args) {
            String A = "111";
            String B = "001";


    }

    static String addBinary(String a , String b){
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry == 1){
            int total = carry;

            if(i >= 0) total += a.charAt(i--) - '0';
            if(i >= 0) total += b.charAt(j--) - '0';
            ans.append(total % 2);
            carry = total/2;

        }
        return ans.reverse().toString();
    }
}
