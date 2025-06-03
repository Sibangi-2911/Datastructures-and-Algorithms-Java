//selection sort
public class practice2 { 
  public static void selectionSort(int nums[]){
    for(int i=0;i<nums.length-1;i++){
      int maxPosition = i;
      for(int j=i+1;j<nums.length;j++){
        if(nums[maxPosition]<nums[j]){
          maxPosition = j;
        }
      }
    int temp = nums[maxPosition];
    nums[maxPosition] = nums[i];
    nums[i] = temp;
    }
  }
  public static void printArray(int nums[]){
    for(int i=0;i<nums.length;i++){
      System.out.print(nums[i] + " ");
    }
    System.out.println();
  }
  public static void main(String args[]){
    int nums[] = {3,6,2,1,8,7,4,5,3,1};
    selectionSort(nums);
    printArray(nums);
  }
}
