package bestTimeToBuy;

public class BestTimeToBuy {
    int result = 0;
    int buy;
    int sell;

    public int maxProfit(int[] prices) {
        for(int i = 0; i < prices.length-1; i++){
            buy = prices[i];
            for(int j = i+1; j < prices.length; j++){
                sell = prices[j];
                if(buy - sell < 0 && result <= (buy - sell)*-1){
                    result = (buy-sell)*-1;
                }
            }
        }
        return result;
    }

}
