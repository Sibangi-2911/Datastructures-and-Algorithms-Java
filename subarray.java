import java.util.*;
public class subarray {
    public static void printSubarrays(int numbers[]){
        int totalSubarrays =0;
        int maxSum = Integer.MIN_VALUE;
        int maxstartIndex = -1;
        int maxendIndex = -1;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                int currentArraysum =0;
                System.out.print("[");
                for(int k= start;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                    currentArraysum+=numbers[k];
                }
                if(currentArraysum>maxSum){
                    maxSum=currentArraysum;
                    maxstartIndex=start;
                    maxendIndex=end;
                }
                totalSubarrays++;
                System.out.print("]");
                System.out.println(": Sum of this subarray is="+currentArraysum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays: "+totalSubarrays);
        System.out.println("Maximum Sum of a Subarray is:"+maxSum);
        if(maxstartIndex!=-1 && maxendIndex!=-1){
            for(int i=maxstartIndex;i<=maxendIndex;i++){
                System.out.print(numbers[i]+" ");
            }
        }
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        printSubarrays(numbers);
    }
}
