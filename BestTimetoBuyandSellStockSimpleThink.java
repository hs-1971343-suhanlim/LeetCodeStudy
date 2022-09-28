import java.util.Arrays;

class Solution {
	/*
    public int maxProfit(int[] prices) {
    	int bigger=0;
    	for(int i=0;i<prices.length;i++) {
    		for(int j=i;j<prices.length;j++) {
    			int tmpValue = prices[j]-prices[i];
    			if(tmpValue>0){
    				f(bigger<tmp.elementAt(i))
    					bigger = tmp.elementAt(i);
    			}
    		}
    	}
    	return bigger;
    }*/
	public int maxProfit(int[] prices) {
		int buyingTimeing = prices[0];
		int res = 0;
		int benefit =0;
		for(int i=0;i<prices.length;i++) {
			if(prices[i]<buyingTimeing)
				buyingTimeing = prices[i];
			benefit = prices[i]-buyingTimeing;
			if(res<benefit)
				res = benefit;			
		}
		return res;	
	}
}
public class BestTimetoBuyandSellStockSimpleThink {

}
