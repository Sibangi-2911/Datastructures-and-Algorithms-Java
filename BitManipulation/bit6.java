public class bit6 { 
  public static int clearIthBit(int n, int i){
    int bitMask = ~(1<<i);
    return n & bitMask;
  }
  public static int updateIthBit(int n, int i, int newbit){
    n = clearIthBit(n, i);
    int bitMask = newbit<<i;
    return n | bitMask;
  }
  public static void main(String args[]){
    System.out.println(updateIthBit(10, 2, 1));
  }
}
