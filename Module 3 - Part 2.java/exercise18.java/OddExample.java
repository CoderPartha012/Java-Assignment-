import java.util.Scanner;

public class OddExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("The given no is even");
        } else {
            System.out.println("The given no is odd");
        }
    }
}
