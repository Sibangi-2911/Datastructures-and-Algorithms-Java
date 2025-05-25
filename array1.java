import java.util.*;
public class array1 {
    public static int binarySearch(int numbers[], int key){
        int start=0,end=numbers.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;
            } else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static void reverseArray(int numbers[]){
        int first=0,last=numbers.length-1;
        while(first<last){
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            
            first++;
            last--;
        }
    }

    public static void pairArray(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.println("("+curr+","+numbers[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        int key = 6;
        System.out.println(binarySearch(numbers, key));
        reverseArray(numbers);
        for(int i=0;i<=numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        pairArray(numbers);
    }
}
