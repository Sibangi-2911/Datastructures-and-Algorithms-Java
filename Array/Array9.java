public class Array9 { 
  public static void printSubarrays(int numbers[]){
    int ts =0;
    int min_sum = Integer.MAX_VALUE;
    int max_sum = Integer.MIN_VALUE;
    for(int i = 0;i<numbers.length;i++){
      int subarray_sum =0;
      for(int j=i;j<numbers.length;j++){
          subarray_sum+=numbers[j];
        for(int k= i;k<=j;k++){
          System.out.print(numbers[k]+ " ");
        }
        System.out.println("Subarray sum: "+subarray_sum);
        if(subarray_sum>max_sum){
          max_sum = subarray_sum;
        }
        if(subarray_sum<min_sum){
          min_sum=subarray_sum;
        }
        ts++;
        System.out.println();
      }
      System.out.println();
    }
    System.out.println("Minimum Subarray Sum: "+min_sum);
    System.out.println("Maximum Subarray Sum: "+max_sum);
    System.out.println("Total Subarrays: "+ts);
  }
  public static void main(String args[]){
    int numbers[] = {2,4,6,8,10};
    printSubarrays(numbers);
  }
}
