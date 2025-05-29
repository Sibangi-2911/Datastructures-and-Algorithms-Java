// Brute force but time complexity is O(n^3) this is very bad time complexity
public class Array10 { 
  public static void maxsubarraySum(int numbers[]){
    int currentSum =0;
    int max_sum = Integer.MIN_VALUE;
    for(int i=0;i<numbers.length;i++){
      for(int j=i; j<numbers.length;j++){
        currentSum =0;
        for(int k=i;k<=j;k++){
          currentSum+=numbers[k];
        }
        System.out.println(currentSum);
        if(max_sum<currentSum){
          max_sum=currentSum;
        }
      }
    }
    System.out.println("Maximum Subarray sum : "+max_sum);
  }
  public static void main(String args[]){
    int numbers[] = {1,-2,6,-1,3};
    maxsubarraySum(numbers);
  }
}
