
class Account {
  double balance;
    
  public static void main(String args[]) {
      Account account1=null;
      Account account2=null;
      account1=new Account();
      account2=new Account();
      account2=account1;
      account1=new Account();                  // Line 1
      System.out.println(account1.balance);
  }
}