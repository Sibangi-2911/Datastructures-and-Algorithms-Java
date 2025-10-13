//Code for Implementation of Queue using Java Collection Framework with class ArrayDeque

import java.util.ArrayDeque;
import java.util.Queue;

public class que5 {
  public static void main(String args[]){
    Queue<Integer> q = new ArrayDeque<>();
    q.add(1);
    q.add(2);
    q.add(3);
    while(!q.isEmpty()){
      System.out.println(q.peek());
      q.remove();
    }
  }
}
