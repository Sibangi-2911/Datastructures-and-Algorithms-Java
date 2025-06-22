//find the first occurence of an element in an array return the index 
public class Rec7 {
  public static int firstOccurence(int array[], int key, int i){
    if(i == array.length-1){
      return -1;
    }
    if(array[i] == key){
      return i;
    }
    return firstOccurence(array, key, i+1);
  }
  public static void main(String args[]){
    int array[] = {1,2,34,5,6};
    System.out.println(firstOccurence(array, 5, 0));
  }
}
