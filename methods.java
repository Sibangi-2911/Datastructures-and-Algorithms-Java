public class methods {
    public static void averagenum(int a, int b, int c){
        int avg = (a+b+c)/3;
        System.out.println(avg);
    }
    public static boolean isEven(int num){
        boolean Even = true;
        if(num%2!=0){
            Even = false;
        }
        return Even;
    }
    public static boolean isPalindrome(int n){
        int reverse =0;
        int palindrome = n;
        while(n!=0){
            int rem = palindrome%10;
            reverse = reverse*10+rem;
            palindrome=palindrome/10;
        }
        if(palindrome==reverse){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        averagenum(1, 2, 3);
        System.out.println(isEven(5));
        
    }
}
