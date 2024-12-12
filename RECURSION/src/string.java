public class string {



    static String removeA(String s,int idx){
        if(idx == s.length()){
            return " ";
        }
        String small = removeA(s,idx+1);
        char current = s.charAt(idx);
        if(current != 'a'){
            return current + small;
        }
        else {
            return small;
        }

    }


    static String removeWord(String word,String startWord){
        if(word.isEmpty()){
            return "";
        }
        if(word.startsWith(startWord)){
            return removeWord(word.substring(startWord.length()),startWord);
        } else {
            return word.charAt(0) + removeWord(word.substring(1),startWord);
        }
    }

    static String remove2A(String s){
        if(s.length() == 0){
            return "";
        }
        String small = remove2A(s.substring(1));
        char current = s.charAt(0);
        if(current != 'a'){
            return current + small;
        } else {
            return small;
        }


    }




   static String reverse(String s , int indx){
        if(indx == s.length()){
            return  "";
        }
        String small = reverse(s,indx + 1);
        return small + s.charAt(indx);
   }

   static boolean isPalindrom(String s , int left , int rigth ){
        if(left >= rigth){
            return true;
        }
        return (s.charAt(left) == s.charAt(rigth) && isPalindrom(s,left+1,rigth-1));
   }


    static String reverse2(String s){
        if( s.length() == 0){
            return  "";
        }
        String Small = reverse2(s.substring(1));
        char curr = s.charAt(0);
        return Small + curr;


    }


    public static void main(String[] args) {
      String s = "appal";
      String ans = removeA(s,0);
        System.out.println(ans);


    }
}
