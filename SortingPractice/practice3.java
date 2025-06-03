//Insertion Sort
public class practice3 { 
  public static void insertionSort(int nums[]){
    for(int i=1;i<nums.length;i++){
      int current = nums[i];
      int previous = i-1;
      while(previous>=0 && nums[previous]<current){
        nums[previous+1] = nums[previous];
        previous--;
      }
      nums[previous+1] = current;
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
    insertionSort(nums);
    printArray(nums);
  }
}
