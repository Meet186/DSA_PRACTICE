public class frogq {
    // {q1-last lecture of recurssion (pw-skills}


    static int frogJump(int h[], int n , int indx){
        if(indx == n-1) return 0;
        int op1 = frogJump(h,n,indx+1) + Math.abs(h[indx] - h[indx+1]);
        if(indx == n-2) return op1;
        int op2 = frogJump(h,n,indx+2) + Math.abs(h[indx] - h[indx+2]);
        return Math.min(op1,op2);
    }



    public static void main(String[] args) {
        int arr [] = {10,30,40,20};
        int ans = frogJump(arr,4,0);
        System.out.println(ans);
    }
}
