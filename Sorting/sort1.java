// Bubble sort
import java.util.*;
public class sort1 { 
  public static void bubbleSort(int nums[]){
    boolean swapped;
    for(int turn=0;turn<nums.length-1;turn++){
      swapped=false;
      for(int j = 0;j<nums.length-1-turn;j++){
        if(nums[j]>nums[j+1]){
          int temp = nums[j];
          nums[j] = nums[j+1];
          nums[j+1] = temp;

          swapped = true;
        }
      }
      if(!swapped){
      break;
    }
    }
  }
  public static void printArray(int nums[]){
    for(int i=0;i<nums.length;i++){
      System.out.print(nums[i] + " ");
    }
    System.out.println();
  }
  public static void main(String args[]){
    int nums[] = {5,4,1,3,2};
    bubbleSort(nums);
    printArray(nums);
  }
}
