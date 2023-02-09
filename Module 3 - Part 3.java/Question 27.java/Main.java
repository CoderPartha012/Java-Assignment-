import java.util.Scanner;

class DefaultAccount {
    int accountNumber;
    String name;
    String address;

    public DefaultAccount() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Account number: ");
        accountNumber = input.nextInt();
        System.out.print("Enter Name: ");
        name = input.next();
        System.out.print("Enter Address: ");
        address = input.next();
    }

    public void displayDetails() {
        System.out.println("Account number : " + accountNumber);
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
    }
}

public class Main {
    public static void main(String[] args) {
        DefaultAccount da = new DefaultAccount();
        da.displayDetails();
    }
}
