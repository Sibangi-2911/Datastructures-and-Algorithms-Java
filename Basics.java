import java.util.*;
public class Basics{
    public static void dectobin(int decnumb){
        int mynum = decnumb;
        int pow=0;
        int binnum =0;
        while(decnumb>0){
            int rem = decnumb%2;
            binnum=binnum+(rem*(int)Math.pow(10, pow));
            pow++;
            decnumb=decnumb/2;
        }
        System.out.println(binnum);
    }
    public static void main(String args[]){
        dectobin(7);
    }
}
