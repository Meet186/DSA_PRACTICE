public class sprialMatrix {

    static boolean judgeSquareSum(int c) {
        int nums [] = new int[c];
        for (int i = 0; i < c; i++) {
            nums[i] = i * i;
            
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if(nums[i] + nums[j] == c){
                    return true;
                }

            }

        }
        return false;
    }
    
    public static void main(String[] args) {
        boolean ans = judgeSquareSum(3);
//        System.out.println(ans);

        }
}
