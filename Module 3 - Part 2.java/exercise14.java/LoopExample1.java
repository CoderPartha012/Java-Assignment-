import java.util.Scanner;

public class LoopExample1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of terms: ");
    int terms = sc.nextInt();
    sc.close();

    for (int i = 1; i <= terms; i++) {
      System.out.println("i=" + i);
    }
  }
}
