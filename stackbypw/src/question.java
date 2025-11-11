import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;



public class question {

    public static   class pair{
       static int data;
       static int index;
        pair(int data, int idx){
            this.data = data;
            this.index = idx;
        }

       static void print(){
            System.out.print(data + ",");
            System.out.print(index);
            System.out.println();
        }

    }

    static int makeBlancedBracket(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if(ch == '('){
                st.push(ch);
            } else {
                // ch == ')'
                count++;
            }

        }
        int size = st.size() - count;
        return Math.abs(size);

    }

    static boolean blancedBracket(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if(ch == '('){
                st.push(ch);
            } else {
                // ch == ')'
                if(st.size() == 0) return false;
                if(st.peek() == '(') st.pop();
            }
        }
        if(st.size() > 0) return false;
         else return true;

    }

    static int [] removeConsictive(int arr []){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(st.empty() || st.peek() != arr[i]){
                st.push(arr[i]);
            } else if (arr[i] == st.peek()) {
                if( i == n-1 || arr[i] != arr[i+1]){
                    st.pop();
                }
            }
        }
        int res [] = new int[st.size()];
        int m = res.length - 1;
        for (int i = m; i >= 0 ; i--) {
            res[i] = st.pop();
        }
        return res;
    }

    static int [] nextGraterEl(int arr []){
        // TC - O(N * N)
        int ans [] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = -1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] > arr[i]){
                    ans[i] = arr[j];
                    break;
                }
            }

        }
        return ans;
    }

    static int [] nextGraterEl2(int arr []){

        // TC - O(N)
        // SC -O(N)
       Stack<Integer> st = new Stack<>();
       int n = arr.length;
       int res [] = new int[n];

        for (int i = n-1; i >= 0 ; i--) {
            while (!st.empty() && st.peek() < arr[i]){
                st.pop();
            }
            if(st.empty()){
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return res;
    }

    static int [] countStock(int arr []){

        // bruteforse;
        // TC - O(N*N)
        // Leetcode - 901. {better appproach}
        int res [] = new int[arr.length];
        res[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            int count = 1;
            for (int j = i-1; j >= 0; j--) {
                while (arr[i] > arr[j]){
                    count++;
                    j--;
                }
            }
            res[i] = count;
        }
        return res;
    }

    static int [] nextHighTempreture(int arr []){
        int n = arr.length;
        Stack<int []> st = new Stack<>();
        int res [] = new int[n];
        st.push(new int[] {arr[n-1],n-1});
        res[n-1] = 0;
        for (int i = n-2; i >=0 ; i--) {
            while (!st.empty() && arr[i] > st.peek()[0]){
                st.pop();
            }
            if(st.size() == 0){
                res[i] = 0;
            }
            else{
                res[i] =  st.peek()[1] - i;
            }
            st.push(new int[] {arr[i],i});
        }
        return res;
    }

    static int [] stock(int arr []){
        int n = arr.length;
        Stack<int[]> st = new Stack<>();
        int res [] = new int[n];
        res[0] = 1;
        st.push(new int[]{arr[0],0});
        for (int i = 1; i < n; i++) {
            while (!st.empty() && arr[i] > st.peek()[0]){
                st.pop();
            }
            if(st.size() == 0) res[i] = i + 1;
            else res[i] = i - st.peek()[1];
            st.push(new int[] {arr[i],i});

        }
        return res;
    }

    static int [] previousGraterEl(int arr []){
        int n = arr.length;
        int res [] = new int [n];
        Stack<Integer> st = new Stack<>();
        res[0] = -1;
        st.push(arr[0]);
        for (int i = 1; i <n ; i++) {
            while (!st.empty() && arr[i] >  st.peek()){
                st.pop();
            }
            if(st.empty()) res[i] = -1;
            else res[i] = st.peek();
            st.push(arr[i]);

        }
        return res;
    }

    static int [] nextSmallerEl(int arr []){
        int n = arr.length;
        int res [] = new int [n];
        res[n-1] = n;
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
       for (int i = n-2; i >= 0 ; i--) {
           while (!st.empty() && arr[st.peek()] > arr[i]){
               st.pop();
           }
           if(st.empty()) res[i] = n;
           else res[i] = st.peek();
           st.push(i);

       }
       return res;

   }

    static int [] previousSmallerEl(int arr []){
       int n = arr.length;
       int res [] = new int [n];
       res[0] = -1;
       Stack<Integer> st = new Stack<>();
       st.push(0);

       for (int i = 1; i <n ; i++) {
           while (!st.empty() && arr[st.peek()] > arr[i]){
               st.pop();
           }
           if(st.empty()) res[i] = -1;
           else res[i] = st.peek();
           st.push(i);
       }
       return res;
   }

   //   INFIX - EXPERESSION.
   static int piratoryclaculation(String s){
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

       for (int i = 0; i < s.length(); i++) {
           char ch = s.charAt(i);
           int ascai = (int) ch;

           if(ascai >= 48 && ascai <= 57){
               val.push(ascai-48);
           } else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
               op.push(ch);
           } else if (ch == ')') {
               while (op.peek() != '('){
                   // work
                   int val2 = val.pop();
                   int val1 = val.pop();

                   if(op.peek() == '+') val.push(val1 + val2);
                   if(op.peek() == '-') val.push(val1 - val2);
                   if(op.peek() == '*') val.push(val1 * val2);
                   if(op.peek() == '/') val.push(val1 / val2);

                   op.pop();
               }
               // remove '(' from op Stack.
               op.pop();

           } else {
               if(ch == '+' || ch == '-'){
                   // work
                   int val2 = val.pop();
                   int val1 = val.pop();

                   if(op.peek() == '+') val.push(val1 + val2);
                   if(op.peek() == '-') val.push(val1 - val2);
                   if(op.peek() == '*') val.push(val1 * val2);
                   if(op.peek() == '/') val.push(val1 / val2);

                   op.pop();
                   op.push(ch);

               } else if (ch == '*' || ch == '/') {
                   if(op.peek() == '*' || op.peek() == '/'){
                       int val2 = val.pop();
                       int val1 = val.pop();

                       if(op.peek() == '*') val.push(val1 * val2);
                       if(op.peek() == '/') val.push(val1 / val2);

                       op.pop();
                       op.push(ch);

                   } else {
                       op.push(ch);

                   }

               }
           }

       }

       while (val.size() > 1){
           int val2 = val.pop();
           int val1 = val.pop();

           if(op.peek() == '+') val.push(val1 + val2);
           if(op.peek() == '-') val.push(val1 - val2);
           if(op.peek() == '*') val.push(val1 * val2);
           if(op.peek() == '/') val.push(val1 / val2);

           op.pop();

       }
       return val.peek();
   }

   // PreFIX - EXPRESSION.

    static String preFix(String str){
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascai = (int) ch;
            if(ascai >= 48 && ascai <= 57){
                val.push("" + ch);
            } else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
                op.push(ch);
            } else if(ch == ')'){
                while (op.peek() != '('){
                    /// work
                     String val2 = val.pop();
                     String val1 = val.pop();
                     char o = op.pop();
                     String newVal = o + val2 + val1;
                     val.push(newVal);
                }
                op.pop();
            } else {
                if(ch == '+' || ch == '-'){
                    String val2 = val.pop();
                    String val1 = val.pop();
                    char o = op.pop();
                    String newVal = o + val2 + val1;
                    val.push(newVal);
                    op.push(ch);
                } else if (ch == '*' || ch == '/') {
                    if(op.peek() == '*' || op.peek() == '/'){
                        String val2 = val.pop();
                        String val1 = val.pop();
                        char o = op.pop();
                        String newVal = o + val2 + val1;
                        val.push(newVal);
                        op.push(ch);
                    } else {
                        op.push(ch);
                    }
                }
            }
        }
        while (val.size() > 1){
            String val2 = val.pop();
            String val1 = val.pop();
            char o = op.pop();
            String newVal = o + val2 + val1;
            val.push(newVal);
        }
        return val.peek();
    }
    // postFix
    static String postFix(String str){
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascai = (int) ch;
            if(ascai >= 48 && ascai <= 57){
                val.push("" + ch);
            } else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
                op.push(ch);
            } else if(ch == ')'){
                while (op.peek() != '('){    /// work
                    String val2 = val.pop();
                    String val1 = val.pop();
                    char o = op.pop();
                    String newVal = val1 + val2 + o;
                    val.push(newVal);
                }
                op.pop();
            } else {
                if(ch == '+' || ch == '-'){
                    String val2 = val.pop();
                    String val1 = val.pop();
                    char o = op.pop();
                    String newVal = val1 + val2 + o;
                    val.push(newVal);
                    op.push(ch);
                } else if (ch == '*' || ch == '/') {
                    if(op.peek() == '*' || op.peek() == '/'){
                        String val2 = val.pop();
                        String val1 = val.pop();
                        char o = op.pop();
                        String newVal = val1 + val2 + o;
                        val.push(newVal);
                        op.push(ch);
                    } else {
                        op.push(ch);
                    }

                }
            }
        }
        while (val.size() > 1){
            String val2 = val.pop();
            String val1 = val.pop();
            char o = op.pop();
            String newVal = val1 + val2 + o;
            val.push(newVal);
        }

        return val.peek();
    }

    // prefix to infix

    static int prefixtoinfix(String str){
        Stack<Integer> st = new Stack<>();
        for (int i = str.length() - 1; i >= 0 ; i--) {
            char ch = str.charAt(i);
            int ascai = (int) ch;
            if(ascai >= 48 && ascai <= 57){
                st.push(ascai-48);
            } else {
                int val1 = st.pop();
                int val2 = st.pop();

                if(ch == '+') st.push(val1 + val2);
                if(ch == '-') st.push(val1 - val2);
                if(ch == '*') st.push(val1 * val2);
                if(ch == '/') st.push(val1 / val2);

            }

        }
        return st.peek();
    }
    // prefix to postfix
    static String prefixToPostFix(String str){
        Stack<String> st = new Stack<>();
        for (int i = str.length()-1; i >=0 ; i--) {
            char ch = str.charAt(i);
            int ascai = (int) ch;
            if(ascai >= 48 && ascai <= 57){
                // 0 to 9
                st.push("" + ch);
            } else {
                String val1 = st.pop();
                String val2 = st.pop();
                String newString = val1 + val2 + ch;
                st.push(newString);
            }
        }
        return st.peek();
    }
    // postFix to prefix
    static  String postFixToPrefix(String str){
        Stack<String> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascai = (int) ch;
            if(ascai >= 48 && ascai <= 57){
                // 0 to 9
                st.push("" + ch);
            } else {
                String val2 = st.pop();
                String val1 = st.pop();
                String newString =  ch + val1 + val2 ;
                st.push(newString);
            }
        }
        return st.peek();
    }
    // postfix to infix
    static int postFixToInfix(String str){
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascai = (int) ch;
            if(ascai >=48 && ascai <= 57){
                // 0  to 9
                st.push(ascai-48);
            } else {
                // + - * /
                int val2 = st.pop();
                int val1 = st.pop();

                if(ch == '+') st.push(val1 + val2);
                if(ch == '-') st.push(val1 - val2);
                if(ch == '*') st.push(val1 * val2);
                if(ch == '/') st.push(val1 / val2);
            }
        }
        return st.peek();
    }
   static int isCelibraty(int matrix [][],int n){
        // brute force approach..
       for (int i = 0; i < n; i++) {
        boolean celebraty = true;
           for (int j = 0; j < n; j++) {
               if(i != j && (matrix[i][j] == 1 || matrix[j][i] == 0)){
                   // that's mean i never be a celibraty because i know j && j did not know i .
                   celebraty = false;
               }
           }
           if(celebraty){
               return i;
           }
       }
       return -1;
   }
   static int isCleibraty2(int matrix [][],int n ){
        Stack<Integer> st = new Stack<>();
       for (int i = 0; i < n; i++) {
           st.push(i);
       }
       while (st.size() > 1){
           int val1 = st.pop();
           int val2 = st.pop();
           if(matrix[val1][val2] == 0){
               // think v1 is celebrity
               st.push(val1);
           } else if (matrix[val2][val1] == 0) {
               // think v2 is celebrity
               st.push(val2);
           }
       }
       if(st.size() == 0) return -1;
       int potential = st.pop();

       for (int j = 0; j <n ; j++) {
           if(matrix[potential][j] == -1 ) return -1;
       }
       for (int i = 0; i < n; i++) {
           if(i == potential) continue;
           if(matrix[i][potential] == 0) return -1;
       }
       return potential;
   }

   static int [] nextGraterIndex(int arr []){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int ans [] = new int[arr.length];
        ans[n-1] = -1;
        st.push(n-1);

       for (int i = n-2; i >=0 ; i--) {
           while (!st.isEmpty() && arr[i] > arr[st.peek()]){
               st.pop();
           }
           if(st.isEmpty()) ans[i] = -1;
           else ans[i] = st.peek();
           st.push(i);

       }
       return ans;
   }
   static int [] previousSamll(int arr[]){
        Stack<Integer> st = new Stack<>();
        st.push(0);
        int ans [] = new int[arr.length];
        ans[0] = -1;

       for (int i = 1; i < arr.length; i++) {
           while (!st.isEmpty() && arr[i] < arr[st.peek()]){
               st.pop();
           }
           if(st.isEmpty()) ans[i] = -1;
           else ans[i] = st.peek();
           st.push(i);
       }
       return ans;
   }
   static int maxIndexDiff(int arr []){
       int n = arr.length;
       int aux [] = new int[n];
       aux[n-1] = arr[n-1];
       for (int i = n-2; i >=0 ; i--) {
           if(arr[i] < aux[i+1]){
               aux[i] = aux[i+1];
           } else {
               aux[i] = arr[i];
           }
       }
       int i=0;
       int j =0;
       int max = 0;
       while (i < n && j < n){
           if(arr[i] <= aux[j]){
               if(j-i > max ){ max = j-i;}
               j++;
           } else {
               i++;
               j = i;
           }
       }
       return max;
   }
    static int strstr(String s1, String s2){
        int m = s1.length();
        int n = s2.length();

        if(m < n) return -1;

        for(int i = 0; i <= m-n; i++){
            int j = 0;
            while(j < n && s1.charAt(i+j) == s2.charAt(j)){
                j++;
                if(j == n){
                    return i;
                }
            }
        }
        return -1;
        }

    public static void main(String[] args) {
        String s1 = "leetcode";
        String s2 = "et";
        int ans = strstr(s1,s2);
        System.out.println(ans);

    }

    }



