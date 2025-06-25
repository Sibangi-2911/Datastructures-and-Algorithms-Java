//ForagivenintegerarrayofsizeN.Youhavetofindalltheoccurrences(indices)ofagivenelement(Key)andprintthem.Usearecursivefunctiontosolvethisproblem
public class Rec15 {
  public static void allOcurrences(int arr[], int key, int i){
    //base case
    if(i==arr.length){
      return;
    }
    if(arr[i]==key){
      System.out.println(i +" ");
    }
    allOcurrences(arr, key, i+1);
  }
  public static void main(String args[]){
    int arr[] = {3,2,4,5,6,2,7,2,2};
    int key=2;
    allOcurrences(arr, 2, 0);
    System.out.println();
  }
}
