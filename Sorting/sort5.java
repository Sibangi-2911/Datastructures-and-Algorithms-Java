//Array in descending order
import java.util.Arrays;
import java.util.Collections;
public class sort5 { 
  public static void printArray(Integer nums[]){
    for(int i=0;i<nums.length;i++){
      System.out.print(nums[i] + " ");
    }
    System.out.println();
  }
  public static void main(String args[]){
  Integer nums[] = {5,4,1,3,2};
  Arrays.sort(nums,0,3,Collections.reverseOrder());
  printArray(nums);
  Arrays.sort(nums,Collections.reverseOrder());
  printArray(nums);
  }
}
