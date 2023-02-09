import java.util.Scanner;

public class MaxThree {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of 'a': ");
    int a = sc.nextInt();
    System.out.print("Enter the value of 'b': ");
    int b = sc.nextInt();
    System.out.print("Enter the value of 'c': ");
    int c = sc.nextInt();
    sc.close();

    int max = a;
    String maxValue = "a";
    if (b > max) {
      max = b;
      maxValue = "b";
    }
    if (c > max) {
      max = c;
      maxValue = "c";
    }
    System.out.println(maxValue + " is maximum");
  }
}
