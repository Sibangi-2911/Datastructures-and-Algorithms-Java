//search in rotataed sorted array
public class searchInRotatedArray {
  public static int Search(int arr[], int target, int si, int ei){
    //base case
    if(si>ei){
      return -1;
    }
    //kaam
    int mid = si+(ei-si)/2;
    if(arr[mid]==target){
      return mid;
    }
    //if mid in line1
    if(arr[si]<=arr[mid]){
      //case a - left side 
      if(arr[si]<=target && target<=arr[mid]){
        return Search(arr, target, si, mid-1);
      }
      //right side
      else{
        return Search(arr, target, mid+1, ei);
      }
    }
    //if mid in line2
    else{
      if(arr[mid]<=target && target<=arr[ei]){
        //case a right side 
        return Search(arr, target, mid+1, ei);
      }
      //case b left side
      else{
        return Search(arr, target, si, mid-1);
      }
    }
  }
  public static void main(String args[]){
    int arr[] = {4,5,6,7,0,1,2};
    int target =0;
    int targetIndex = Search(arr, target, 0, arr.length-1);
    System.out.println(targetIndex);
  }
}
