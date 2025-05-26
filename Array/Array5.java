//Find largest number in the array
import java.util.*;
public class Array5 {
  public static int largeandsmallNumber(int numbers[]){
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;
    for(int i=0;i<numbers.length;i++){
      if(numbers[i] > largest){
        largest=numbers[i];
      }
      if(numbers[i] < smallest){
        smallest=numbers[i];
      }
    }
    System.out.println("Smallest number in the array is: " + smallest);
    return largest; //return the largest number found
  }
  public static void main(String args[]){
    int numbers[] = {1,2,6,8,4,3,9,5,7,10};
    int large_no = largeandsmallNumber(numbers);
    System.out.println("Largest number in the array is: " + large_no);
  }
}
