import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        StringBuilder str = new StringBuilder(sc.next());
//        String name = "mEEt";
//        convertString(name);
//        System.out.println(name);

        String details[] = {"7868190130M7522", "5303914400F9211", "9273338290F4010"};

        String an = "mEEt";




    }

    // Convert LowerCase to UpperCase && UpperCase to LowerCase .

    static void change(StringBuilder str) {
        for (int i = 0; i < str.length(); i++) {
            boolean falg = true; // a
            char ch = str.charAt(i);
            int ascai = (int) ch;
            if (ascai < 97) {
                falg = false;
            }

            if (falg == true) {
                ascai -= 32;
                char dh = (char) ascai;
                str.setCharAt(i, dh);
            } else {
                ascai += 32;
                char dh = (char) ascai;
                str.setCharAt(i, dh);
            }
        }


    }

    static void convertString(String str) {
        for (int i = 0; i < str.length(); i++) {
            boolean falg = true; // a
            char ch = str.charAt(i);
            int ascai = (int) ch;
            if (ascai < 97) {
                falg = false;
            }

            if (falg == true) {
                ascai -= 32;
                char dh = (char) ascai;
                str = str.substring(0, i) + dh + str.substring(i + 1);
            } else {
                ascai += 32;
                char dh = (char) ascai;
                str = str.substring(0, i) + dh + str.substring(i + 1);
            }
        }
    }

    // Given a String return Number of all palindrom substring in it.

    static boolean isPlindrom(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    static int palindromsubstring(String str) {
        int count = 0;
        List<String> plindromlist = new ArrayList<>();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length() - 1; j++) {
                String sub = str.substring(i, j);
                list.add(sub);
                if (isPlindrom(str.substring(i, j)) == true) {
                    String el = str.substring(i, j);
                    plindromlist.add(el);
                    count++;
                }
            }

        }
        System.out.println("All Subset-List");
        System.out.println(list);
        System.out.println("Plaindrom Subet-List");
        System.out.println(plindromlist);
        System.out.println("Total-Count");
        return count;
    }

    // Reverse all words of sentence.

    static void reverseSentence(String s) {
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr != ' ') {
                sb.append(curr);
            } else {
                sb.reverse();
                ans += sb;
                ans += " ";
                sb = new StringBuilder(""); // or delete the builder all character.

            }

        }
        sb.reverse();
        ans += sb;

        System.out.println(ans);
    }

    static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr != ' ') {
                sb.append(curr);
            } else {
                sb.reverse();
                ans += sb + " ";
                sb.delete(0, sb.length());
            }
        }
        sb.reverse();
        ans += sb;
        return ans;
    }

    static String reverseSentence1(String str) {
        String words[] = str.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (String el : words) {
            StringBuilder revresedWord = new StringBuilder(el).reverse();
            reversedSentence.append(revresedWord).append(" ");
        }

        return reversedSentence.toString();
    }


    static String mergeWords(String s) {
        // TC - O(N)
        // SC - O(1) {Input && Output Not Included}
        String ans = "" + s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            char prev = s.charAt(i - 1);

            if (curr == prev) {
                count++;
            } else {
                if (count > 1) ans += count;
                count = 1;
                ans += curr;
            }

        }
        if (count > 1) ans += count;
        return ans;
    }

    static int findAge(String arr []){
        int result = 0;
        for(String el : arr){
            int age = Integer.parseInt(el.substring(11,13));
            if(age >= 60){
                result++;
            }
        }

        return result;
    }

    static int findAge2(String arr []){
        int ans = 0;
        for (String el : arr){
            int idx11 = el.charAt(11) - '0';
            int idx12 = el.charAt(12) - '0';

            int age = idx11 * 10 + idx12;
            if(age >= 60) ans++;

        }
        return ans;
    }

    static String addBinary(String a,String b){
        String result = "";
        int carry = 0;
        int lena = a.length();
        int lenb = b.length();

        int i=0;

        while (i < lena || i < lenb || carry != 0){
            int x = 0;
            if(i < lena && a.charAt(i) == '1') x = 1;
            int y = 0;
            if(i < lenb && b.charAt(i) == '1') y = 1;

            result = (x+y+carry)%2+result;
            carry = (x+y+carry)/2;
            i++;
        }
        return result;
    }

   static int countChar(String str){
        int count =  1;
        char ch = str.charAt(0);
        String ans = "";
       for (int i = 1; i < str.length(); i++) {
           char currSymbole = str.charAt(i);
           if(ch == currSymbole){
               count++;
           } else {
               ans += count;
               count = 1;
               ch = currSymbole;
           }
       }
       ans += count;
       return Integer.parseInt(ans);

   }
}
