public class str8 {
  public static void main(String args[]){
    String fruit[] = {"apple","mango","Banana"};
    String largest = fruit[0];
    for(int i=1;i<fruit.length;i++){
      if(largest.compareToIgnoreCase(fruit[i])<0){
        largest = fruit[i];
      }
    }
    System.out.println(largest);
  }
}
