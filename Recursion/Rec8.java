//find the last occurence of an element in an array return the index 
public class Rec8 {
  public static int lastOccurence(int array[], int key, int i){
    if(i ==array.length){
      return -1;
    }
    int isFound = lastOccurence(array, key, i+1);
    if(isFound==-1 && array[i]==key){
      return i;
    }
    return isFound;
  }
  public static void main(String args[]){
    int array[] = {1,2,3,4,3,4,5};
    System.out.println(lastOccurence(array, 4, 0));
  }
}
