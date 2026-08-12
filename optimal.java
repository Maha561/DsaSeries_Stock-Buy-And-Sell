import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int[] prices= {7, 1 , 5,3 ,6 ,4};
      
      int minPrice = prices[0];
      int maxProfit =0;
      int day =0;

      for(int i =1;i< prices.length;i++){

        minPrice = Math.min(minPrice,prices[i]);

        int profit = prices[i]-minPrice;
        maxProfit = Math.max(maxProfit,profit);
      }

      System.out.println(maxProfit);
    }
}

// o(n) tc , sc(1) 
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
