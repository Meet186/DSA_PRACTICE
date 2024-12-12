public class passthepillow {
    public static void main(String[] args) {

    }

    static int passPillow(int n, int time){
            // TC - O(N)

        int idx = 1;
        int direction = 1;

        while (time > 0){
            if(idx + direction >= 1 && idx+direction <= n){
                idx += direction;
            } else {
                direction += -1;

            }
        }
        return idx;
    }

    static int passPillow2(int n , int time){
            // TC - O(1)

        int fullRound = time/(n-1);
        int timeLeft = time % (n-1);

        if(fullRound % 2 == 0){
            return timeLeft + 1;
        } else {
            return n-timeLeft;
        }


    }
}
