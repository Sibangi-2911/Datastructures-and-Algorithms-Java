import java.util.*;
public class Array4{
  public static int linearSearch(int array[], int key){
    for(int i=0;i<array.length;i++){
      if(array[i] == key){
        return i; //return the index of the key
      }
    }
    return -1;
  }
  public static String linearSearch1(String fooditems[], String foodKey){
    for(int i=0;i<fooditems.length;i++){
      if(fooditems[i] == foodKey){
        return "Food item found at index: " +i; //return the index of the food item"
      }
    }
    return "Food item not found in the array.";
  }
  public static void main(String args[]){
    int array[] = {2,4,6,8,10,12,14,16,18,20};
    int key = 12;
    int index = linearSearch(array, key);
    if(index==-1){
      System.out.println("Key not found in the array.");
    } else {
      System.out.println("Key found at index: " + index);
    }
    // Testing with a different key
    String fooditems[] = {"Pizza", "Burger", "Pasta", "Salad", "Sushi"};
    String foodKey = "Pasta";
    String result = linearSearch1(fooditems, foodKey);
    System.out.println(result);
  }
}
