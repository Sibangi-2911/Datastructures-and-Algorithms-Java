public class Array8 { 
  public static void printPairs(int numbers[]){
    int tp =0;
    for(int i=0;i<numbers.length;i++){
      int current_number = numbers[i]; //2 4 6 7 8 10
      for(int j = i+1;j<numbers.length;j++){
        System.out.print("("+current_number+","+numbers[j]+")");
        tp++;
      }
      System.out.println();
    }
    System.out.println("Total pairs: "+tp);
  }
  public static void main(String args[]){
    int numbers[] = {2,4,6,7,8,10};
    printPairs(numbers);
  }
}
