public class countSymbole {
    public static void main(String[] args) {
        String str = "***%%%%%***%%%%%%%%%%%%%";
        int ans = countSymbole(str);
        System.out.println(ans);
    }
    static int countSymbole(String str){
        if(str.isEmpty() || str == null) {
            return 0;
        }
        char currentSymbole = str.charAt(0);
        int count = 1;
        String result = "";
        for (int i = 1; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if(ch == currentSymbole){
                count++;
            } else {
                result += count;
                currentSymbole = ch;
                count = 1;
            }
        }
        result += count;
        return Integer.parseInt(result);
    }

}
