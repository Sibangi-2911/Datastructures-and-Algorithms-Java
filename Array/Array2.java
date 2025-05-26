import java.util.*;
//input, output and update an array
public class Array2 {
  public static void main(String args[]){
    int marks[] = new int[50];
    System.out.println("Enter marks of Physics, Chemistry and Maths: ");
    Scanner sc = new Scanner(System.in);
    marks[0] = sc.nextInt();
    marks[1] = sc.nextInt();
    marks[2] = sc.nextInt();

    System.out.println("Marks of Physics: " + marks[0]);
    System.out.println("Marks of Chemistry: " +marks[1] );
    System.out.println("Marks of Maths: "+ marks[2] );
    System.out.println("Total Marks: " + (marks[0] + marks[1] + marks[2]));

    //update maths marks
    marks[2] = 98;
    marks[1] += 3;
    System.out.println("Updated Marks of Maths: " + marks[2]);
    System.out.println("Updated Marks of Chemistry: " + marks[1]);
    System.out.println("Updated Total Marks: " + (marks[0] + marks[1] + marks[2]));

    int percentage = (marks[0] + marks[1] + marks[2])/3;
    System.out.println("Percentage: " + percentage + "%");

    System.out.println("Array length:"+ marks.length);
    }
  }

