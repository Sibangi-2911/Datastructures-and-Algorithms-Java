public class prac1 { 
  public static void bubbleSort(int arr[]){
    boolean swapped;
    for(int turn=0;turn<arr.length-1;turn++){
      swapped = false;
      for(int j=0;j<arr.length-1-turn;j++){
        if(arr[j]>arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          swapped=true;
        }
      }
      if(!swapped){
        break;
      }
    }
  }
  public static void main(String args[]){
    int arr[] = {2,3,4,5,6,8,9,0,20};
    bubbleSort(arr);
    for(int i =0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
}
