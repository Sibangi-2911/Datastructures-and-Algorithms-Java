//find if any pair in sorted arraylist has a target sum - 2 pointer approach-O(n)
import java.util.*;
public class al11 {
  public static boolean pairSum(ArrayList <Integer> list, int target){
    int leftPointer = 0;
    int rightPointer = list.size()-1;
    while(leftPointer!=rightPointer){
      if(list.get(leftPointer)+list.get(rightPointer) == target){
        return true;
      }
      if(list.get(leftPointer)+list.get(rightPointer)<target){
        leftPointer++;
      }
      if(list.get(leftPointer)+list.get(rightPointer)>target){
        rightPointer--;
      }
    }
    return false;
  }
  public static void main(String args[]){
    ArrayList <Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    int target = 50;
    System.out.println(pairSum(list, target));
  }
}
