import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int[] prices= {7, 1 , 5,3 ,6 ,4};
      int maxProfit =0;

      for(int i =0;i<prices.length;i++){

        for(int j =i+1;j<prices.length;j++){

          int profit =prices[j]-prices[i];

          maxProfit = Math.max(maxProfit,profit);


        }
        
      }
      System.out.println(maxProfit);
    }
}

tc - o(n) output 5 
