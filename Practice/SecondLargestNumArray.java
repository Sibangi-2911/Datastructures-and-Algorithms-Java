public class SecondLargestNumArray {
  public static void main(String args[]){
    int arr[] = {10,25,5,40};
    int firstLargest = Integer.MIN_VALUE;
    int secondLargest = Integer.MAX_VALUE;
    for(int num:arr){
      if(num>firstLargest){
        secondLargest = firstLargest;
        firstLargest = num;
      } else if(num>secondLargest && num!=firstLargest){
        secondLargest=num;
      }
    }
    System.out.println("Second Largest Element in the array : "+secondLargest);
  }
}
