//swap two numbers
import java.util.*;

public class al4 {
  public static void swap2Numbers(ArrayList <Integer> list, int index1, int index2){
    int temp = list.get(index1);
    list.set(index1, list.get(index2));
    list.set(index2, temp);

    System.out.println("After Swap: "+list);
  }
  public static void main(String args[]){
    ArrayList <Integer> list = new ArrayList<>();
    list.add(2);
    list.add(5);
    list.add(9);
    list.add(3);
    list.add(6);
    System.out.println(" Before swap: "+list);
    int index1 = 1, index2 = 3;
    swap2Numbers(list, index1, index2);
}
}
