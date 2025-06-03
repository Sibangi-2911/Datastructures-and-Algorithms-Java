//Counting Sort
public class practice4 { 
  public static void countingSort(int nums[]){
    int largest = Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
      largest = Math.max(largest,nums[i]);
    }
    int count[] = new int[largest+1];
    for(int i=0;i<nums.length;i++){
      count[nums[i]]++;
    }
    //Sorting
    int j=0;
    for(int i=count.length-1;i>=0;i++){
      while(count[i]>0){
        nums[j] = i;
        j++;
        count[i]--;
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
    int nums[] = {3,6,2,1,8,7,4,5,3,1};
    countingSort(nums);
    printArray(nums);
  }
}
