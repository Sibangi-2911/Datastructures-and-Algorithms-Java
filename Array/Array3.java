import java.util.*;
public class Array3 {
  public static void updateMarks(int marks[], int nonChangable){
    nonChangable = 5;
    for(int i=0; i<marks.length;i++){
      marks[i] -=5;
    }
  }
  public static void main(String args[]){
    int marks[] = {98, 99, 100};
    int nonChangable = 10; //primitive data type, non-changable 
    updateMarks(marks, nonChangable);
    System.out.println(nonChangable);
    System.out.println("Marks after update: ");
    for(int i=0; i<=marks.length;i++){
      System.out.println(marks[i]);
    }
  }
}
