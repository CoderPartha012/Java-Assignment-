class Account {
  private int accountNumber;
  private String customerName;

  public Account(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public Account(int accountNumber, String customerName) {
    this(accountNumber);
    this.customerName = customerName;
  }

  public void display() {
    System.out.println(accountNumber);
    System.out.println(customerName);
  }
}

public class AccountTest {
  public static void main(String[] args) {
    Account account1 = new Account(101);
    Account account2 = new Account(101, "Vishal");

    System.out.println("Account 1: ");
    account1.display();
    System.out.println("Account 2: ");
    account2.display();
  }
}
