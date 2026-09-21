class Solution {
    public int maxProfit(int[] prices) {
       int L=0,R=1;
       int maxP=0;
        while(R<prices.length){

            if(prices[L]<prices[R]){
                int profit=prices[R]-prices[L];
                maxP=Math.max(maxP,profit);
            }
            else{
                L=R;
            }
            
            R++;
        }
        return maxP;

    }
}
