//print reverse order  of arraylist - O(n)
import java.util.*;
public class al2{
  public static void main(String args[]){
    ArrayList <Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    System.out.println(list);
    for(int i=list.size()-1;i>=0;i--){
      System.out.print(list.get(i)+ " ");
    }
    System.out.println();
  }
}