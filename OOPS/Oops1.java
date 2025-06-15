//Access modifiers
public class Oops1 {
  public static void main(String args[]){
    BankAccount b1 = new BankAccount();
    b1.userName = "Sibangi";
    b1.setpassword("abcdefgh");
    System.out.println(b1.userName);
  }
}
class BankAccount{
  public String userName;
  private String password; // not accessible it can only be changed
  public void setpassword(String pwd){
    password=pwd;
  }
}