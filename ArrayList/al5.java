//sorting
import java.util.*;
public class al5 {
  public static void main(String args[]){
    ArrayList <Integer> list = new ArrayList<>();
    list.add(2);
    list.add(3);
    list.add(23);
    list.add(10);
    list.add(1);
    System.out.println(list);
    //ascending order
    Collections.sort(list);
    System.out.println("Ascending order: "+list);

    //decsending order
    Collections.sort(list, Collections.reverseOrder());
    System.out.println("Decending Order: "+list);
  }
}
