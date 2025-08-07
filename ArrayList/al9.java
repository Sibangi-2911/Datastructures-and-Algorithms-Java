//container with most water - 2 pointer approach - O(n)
import java.util.*;
public class al9 {
  public static int storeWater(ArrayList <Integer> height){
    int maxWater = 0;
    int leftPointer = 0;
    int rightPointer = height.size()-1;
    while(leftPointer<rightPointer){
      //calculate water area
      int Height = Math.min(height.get(leftPointer), height.get(rightPointer));
      int Width = rightPointer - leftPointer;
      int currWater = Height*Width;
      maxWater = Math.max(maxWater, currWater);
      //update pointer
      if(height.get(leftPointer)<height.get(rightPointer)){
        leftPointer++;
      } else{
        rightPointer--;
      }
    }
    return maxWater;
  }
  public static void main(String args[]){
    ArrayList <Integer> height = new ArrayList<>();
    height.add(1);
    height.add(8);
    height.add(6);
    height.add(2);
    height.add(5);
    height.add(4);
    height.add(8);
    height.add(3);
    height.add(7);

    System.out.println(storeWater(height));
  }
}
