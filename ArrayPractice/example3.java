// You  are  given  an  array prices where prices[i] is  the  price  of  a  given  stock  on  the ith day.Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0
import java.util.*;
public class example3 {
  public static int Stock(int prices[]){
    int buyPrice = Integer.MAX_VALUE;
    int maxProfit =0;
    for(int i=0;i<prices.length;i++){
      if(buyPrice<prices[i]){
        int profit = prices[i]-buyPrice;
        maxProfit = Math.max(profit,maxProfit);
      }
      else{
        buyPrice=prices[i];
      }
    }
    return maxProfit;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int size = sc.nextInt();
    int prices[] = new int[size];
    for(int i=0;i<size;i++){
      prices[i] = sc.nextInt();
    }
    System.out.println("Max Profit is : "+ Stock(prices));
  }
}
