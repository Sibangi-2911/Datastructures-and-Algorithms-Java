// MaxSubarray sum by prefixsum approach
public class Array11 { 
  public static void prefixSum(int numbers[]){
    int currentSum =0;
    int max_sum = Integer.MIN_VALUE;
    int prefix[] = new int[numbers.length];
    prefix[0] = numbers[0];
    for(int i=1;i<numbers.length;i++){
      prefix[i] = prefix[i-1] + numbers[i];
    }
    for(int i=0;i<numbers.length;i++){
      int start =i;
      for(int j=i;j<numbers.length;j++){
        int end = j;
        currentSum= start==0 ? prefix[end] : prefix[end]- prefix[start-1];
        System.out.println(currentSum);
        if(max_sum<currentSum){
          max_sum = currentSum;
        }
      }
    }
    System.out.println("Maximum sum: "+max_sum);
  }
  public static void main(String args[]){
    int numbers[] = {1,-2,6,-1,3};
    prefixSum(numbers);
  }
}
