import java.util.*;
public class arr {
    public static void update(int array1[]){
        for(int i=0; i<array1.length;i++){
            array1[i]+=1;
        }
    }
    public static void main(String args[]){
        int array1 [] = {97,98,99};
        update(array1);
        for(int i=0;i<array1.length;i++){
            System.out.println(array1[i]);
        }
        System.out.println();
    }
}
