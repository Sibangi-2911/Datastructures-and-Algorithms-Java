//Inbuilt sort
import java.util.Arrays;
public class sort4 { 
  public static void printArray(int nums[]){
    for(int i=0;i<nums.length;i++){
      System.out.print(nums[i] + " ");
    }
    System.out.println();
  }
  public static void main(String args[]){
    int nums[] = {5,4,1,3,2};
    Arrays.sort(nums,0,3);
    printArray(nums);
    Arrays.sort(nums);
    printArray(nums);
  }
}
