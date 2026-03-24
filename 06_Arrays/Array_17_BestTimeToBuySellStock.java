public class Array_17_BestTimeToBuySellStock {

  public static int stock(int[] prices){

    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for(int price : prices){

      int profit = 0;

      if(minPrice > price){
        minPrice = price;
      } else {
        profit = price - minPrice;
        maxProfit = Math.max(maxProfit , profit);
      }

    }

    return maxProfit;
        
  }

  public static void main(String[] args) {
    
    System.out.println(stock(new int[] {7,1,5,3,6,4}));
  }
  
}
