public class bit12 {
  public static void main(String args[]){
    int x =3;
    int y =4;
    System.out.println("Before Swap: x is "+ x+ " and y is "+y);
    x = x^y;
    y = x^y;
    x = x^y;
    System.out.println("After Swap: x is "+ x+ " and y is "+y);
  }
}
