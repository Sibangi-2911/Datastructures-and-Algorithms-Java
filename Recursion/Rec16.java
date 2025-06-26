//You are given a number (eg -  2019), convert it into a String of english like“two zero one nine”.  Use a recursive function to solve this problem.NOTE-Thedigitsofthenumberwillonlybeintherange0-9andthelastdigitofanumbercan’t be 0
public class Rec16 {
  static String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
  public static void printDigits(int number){
    if(number==0){
      return;
    }
    int lastdigit = number%10;
    printDigits(number/10);
    System.out.print(digits[lastdigit]+" ");
  }

  public static void main(String args[]){
    printDigits(1234);
  }
}
