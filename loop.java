import java.util.*;
public class loop {

    public static void main(String[] args){
        int num = 12345;
        while(num>0){
            int lastdig = num%10;
            System.out.print(lastdig);
            num = num/10;
        }
    }
}
