//Program for checking duplicate in an array – Duplicate Integer Problem
import java.util.*;
public class prac2 {
  public static boolean hasDuplicate(int nums[]){
    Set<Integer> seen = new HashSet<>();
    for(int num : nums){
      if(seen.contains(num)){
        return true;
      }
      seen.add(num);
    }
    return false;
  }
  public static void main(String args[]){
    int nums[] = new int[4];
    Scanner sc = new Scanner(System.in);
    for(int i =0; i<nums.length;i++){
      System.out.print(" ");
      nums[i] = sc.nextInt();
    }
    System.out.println(hasDuplicate(nums));
  }
}
