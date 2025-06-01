//There is an integer array nums sorted in ascending order (with distinct values).Prior to being passed to your function, nums is possibly rotated at an unknown pivot  index k (1  <=  k  <  nums.length)  such  that  the  resulting  array  is [nums[k], nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).   For   example, [0,1,2,4,5,6,7] might        be        rotated        at        pivot        index 3   and become [4,5,6,7,0,1,2].Given the array nums after the possible rotation and an integer target, returnthe index oftarget if it is in nums, or -1   if it is not in nums.You must write an algorithm with O(log n) runtime complexity.

public class example2 { 
  //Finding the index of the smallest element (pivot)
  public static int minSearch(int nums[]){
    int left = 0;
    int right = nums.length-1;
    while (left<right){
      int mid = left+(right-left)/2;
      if(nums[mid]>nums[right]){
        left = mid+1;
      }
      else{
        right=mid;
      }
    }
    return left;
  }
  // Standard binary search in a given range [left, right]
  public static int Search(int nums[], int left, int right, int target){
    int l = left;
    int r = right;
    while(l<=r){
      int mid = l+(r-l)/2;
      if(nums[mid]==target){
        return mid;
      }
      else if(nums[mid]>target){
        r = mid-1;
      }
      else{
        l = mid+1;
      }
    }
    return -1;
  }
  // Main function to search target in rotated sorted array
public int search(int[] nums, int target) {
    // Step 1: Find the index of the smallest element (pivot)
    int min = minSearch(nums);

    // Step 2: Decide which part to search: left or right of pivot
    if (nums[min] <= target && target <= nums[nums.length - 1]) {
        // Target is in right sorted part
        return Search(nums, min, nums.length - 1, target);
    } else {
        // Target is in left sorted part
        return Search(nums, 0, min - 1, target);
    }
}

  public static void main(String args[]){
    example2 obj = new example2();

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = obj.search(nums, target);
        System.out.println("Index of target: " + result);  // Output: 4
  }
}
