//print maximum in an arraylist
import java.util.*;
public class al3 {
  public static void main(String args[]){
    ArrayList <Integer> list = new ArrayList<>();
    list.add(3);
    list.add(4);
    list.add(6);
    list.add(23);
    list.add(1);
    System.out.println(list);
    int max_value = Integer.MIN_VALUE;
    for(int i=0;i<list.size();i++){
      if(list.get(i)>max_value){
        max_value = list.get(i);
      }
    }
    System.out.println("Maximum value from the list is : "+ max_value);
  }
}
