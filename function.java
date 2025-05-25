import java.util.*;
public class function {
    public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
    public static void calculateSum(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }
    public static void multiply(int a, int b){
        int multi = a*b;
        System.out.println(multi);
    }
    public static void swap(int c, int d){
        int temp = c;
        c=d;
        d=temp;
        System.out.println("c is "+c);
        System.out.println("d is "+d);
    }
    public static int factorial(int n){
        int f=1;
        for(int i =1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String args[]){
        printHelloWorld();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateSum(a, b);
        multiply(a, b);
        int c = 10;
        int d = 5;
        swap(c, d);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}
