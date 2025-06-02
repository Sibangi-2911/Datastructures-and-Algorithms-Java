public class sort2 { 
  public static void selectionSort(int nums[]){
    for(int i=0;i<nums.length-1;i++){
      int minposition = i;
      for(int j=i+1;j<nums.length;j++){
        if(nums[minposition]>nums[j]){
          minposition=j;
        }
      }
      //swap
      int temp = nums[minposition];
      nums[minposition] = nums[i];
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
    int nums[] = {5,4,1,3,2};
    selectionSort(nums);
    printArray(nums);
  }
}
