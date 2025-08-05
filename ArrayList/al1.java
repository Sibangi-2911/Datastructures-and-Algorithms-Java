//arraylist and its operations
import java.util.*;
public class al1 {
  public static void main(String args[]){
    ArrayList<Integer> list = new ArrayList<>();
  ArrayList<Boolean> list2 = new ArrayList<>();
  ArrayList<String> list3 = new ArrayList<>();
  
  //add element
  list.add(1);
  list.add(2);
  list.add(3);
  list.add(4);
  list.add(5);

  list.add(1,9);
  System.out.println(list);

  //size
  System.out.println(list.size());

  //print the arraylist
  for(int i=0;i<list.size();i++){
    System.out.print(list.get(i)+ " ");
  }
  System.out.println();

  //get element
  int element = list.get(2);
  System.out.println(element);

  //remove element
  list.remove(3);
  System.out.println(list);

  //set element at index
  list.set(3, 10);
  System.out.println(list);

  //contains element
  System.out.println(list.contains(10));
  System.out.println(list.contains(11));
  }

}
