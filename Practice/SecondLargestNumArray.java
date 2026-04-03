public class SecondLargestNumArray {
  public static void main(String args[]){
    int arr[] = {25,25,25,25};
    int firstLargest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
    for(int num:arr){
      if(num>firstLargest){
        secondLargest = firstLargest;
        firstLargest = num;
      } else if(num>secondLargest && num!=firstLargest){
        secondLargest=num;
    }
  }
  if(secondLargest == Integer.MIN_VALUE){
        System.out.println("No second largest element");
  }
  else{
    System.out.println("Second Largest Element in the array : "+secondLargest);
  }
}
}
