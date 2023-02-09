import java.util.Scanner;

public class ConsCallmeth {
  int a, b, c;

  ConsCallmeth(int x, int y) {
    a = x;
    b = y;
    add();
  }

  void add() {
    c = a + b;
    System.out.println("The addition of " + a + " and " + b + " is " + c);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of a: ");
    int a = sc.nextInt();
    System.out.print("Enter the value of b: ");
    int b = sc.nextInt();

    ConsCallmeth obj = new ConsCallmeth(a, b);
  }
}
