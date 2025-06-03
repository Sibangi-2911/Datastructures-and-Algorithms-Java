//Bubble sort for decreasing order
public class practice1 {
  public static void bubbleSort(int nums[]){
    for(int i=0;i<nums.length-1;i++){
      for(int j=0;j<nums.length-1;j++){
        if(nums[j]<nums[j+1]){
          int temp = nums[j];
          nums[j] = nums[j+1];
          nums[j+1] = temp;
        }
      }
    }
  }
  public static void printArray(int nums[]){
    for(int i=0;i<nums.length;i++){
      System.out.print(nums[i]+" ");
    }
    System.out.println();
  }
  public static void main(String args[]){
    int nums[] = {3,6,2,1,8,7,4,5,3,1};
    bubbleSort(nums);
    printArray(nums);
  }
}
