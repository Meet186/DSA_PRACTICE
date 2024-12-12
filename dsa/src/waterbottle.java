public class waterbottle {
    public static void main(String[] args) {
        System.out.println(waterBottle3(9,3));
    }

    static int waterBottle(int numBottle,int exchangeBottle){
        // TC - O(N)
        int consumed  = 0;
        while (numBottle >= exchangeBottle){
            consumed += exchangeBottle;
            numBottle -= exchangeBottle;
            numBottle += 1;
        }
        return consumed + numBottle;
    }
    static int waterBottle2(int numBottle,int numExchange){
        // TC - O(logN)
        int consumed = numBottle;
        int emptyBottle = numBottle;

        while (emptyBottle >= numExchange){
            int extraFullBottle = emptyBottle/numExchange;
            int remainExtraBottle = emptyBottle%numExchange;

            consumed += extraFullBottle;
            emptyBottle = remainExtraBottle + extraFullBottle;
        }
        return consumed;
    }

    static int waterBottle3(int numBottle,int numExchange){
            // TC - O(1)
        return numBottle +  (numBottle-1)/(numExchange-1);
    }
}
