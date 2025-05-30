// Using Kadane's algorithm for finding maximum sum in subarray in an array with only single loop
public class Array12 {
  public static void kadaneSum(int numbers[]){
    int currentSum = 0;
    int maxSum = Integer.MIN_VALUE;
    boolean allNegative = true;
    int maxElement = numbers[0];
    for(int i=0;i<numbers.length;i++){
      if(numbers[i]>=0){
        allNegative = false;
      }
      maxElement = Math.max(maxElement,numbers[i]);
      currentSum = currentSum+numbers[i];
      if(currentSum<0){
        currentSum=0;
      }
      maxSum = Math.max(maxSum, currentSum);
    }
    if(allNegative){
      System.out.println("All elements are negative.");
      System.out.println("Maximum Subarray Sum : " + maxElement);
    }else{
        System.out.println("Maximum Subarray Sum : "+maxSum);
    }
  }
  public static void main(String args[]){
    int numbers[] = {-2,-2,4,-1,-2,1,5,-3};
    kadaneSum(numbers);
  }
}
