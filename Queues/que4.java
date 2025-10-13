//Code for Implementation of Queue using Java Collection Framework with class linked list
import java.util.*;
public class que4 {
  public static void main(String args[]){
    Queue<Integer> q = new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);

    while(!q.isEmpty()){
      System.out.println(q.peek());
      q.remove();
    }

    
  }
}
