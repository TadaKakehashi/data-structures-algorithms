package Arrays.Leetcode;
public class Stock_Sell_Buy{
    public static int maxProfit(int[] prices){
        int n = prices.length;
        int maxProfit = 0;
        int buyPrice = prices[0];

         for(int i=1;i<n;i++){
            int currentProfit = prices[i] - buyPrice;
            if(currentProfit > maxProfit){
                maxProfit = currentProfit;
            }

            if(prices[i] < buyPrice){
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));;
    }
}