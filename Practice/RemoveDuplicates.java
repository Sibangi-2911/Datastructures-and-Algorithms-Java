import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
  public static void main(String args[]){
    int arr[] = {1,1,2,3,3,4,4,5,6,6};
    Set<Integer> set = new LinkedHashSet<>();
    for(int num: arr){
      set.add(num);
    }
    System.out.println("Array after removing duplicates: "+set);
  }
}
