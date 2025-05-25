import java.util.*;
public class function1 {
    public static int factorial(int n){
        int f=1;
        for(int i =1; i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int binomialFunction(int n, int r){
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n-r);
        int bino = a/(b*c);
        return bino;
    }
    public static boolean Prime(int n){
        boolean isPrime = true;
        if(n==2){
            isPrime=true;
        }
        for(int i =2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
    public static void primeRange(int n){
        for(int i =2;i<=n;i++){
            if(Prime(i)){ //true
                System.out.println(i+" ");
            }
        }
    }
    public static void bintodec(int binarynum){
        int pow=0;
        int decnum=0;
        while(binarynum>0){
            int lastdigit = binarynum%10;
            decnum = decnum+(lastdigit*(int)Math.pow(2, pow));
            pow++;
            binarynum=binarynum/10;
        }
        System.out.println(decnum);
    }
    public static void dectobin(int decnumb){
        int pow=0;
        int binnum =0;
        while(decnumb>0){
            int rem = decnumb%10;
            binnum=binnum+(rem*(int)Math.pow(10, pow));
            pow++;
            decnumb=decnumb/2;
        }
        System.out.println(binnum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(factorial(n));
        System.out.println(binomialFunction(n, r));
        System.out.println(Prime(n));
        primeRange(n);
        bintodec(101);
        dectobin(7);
    }
}
