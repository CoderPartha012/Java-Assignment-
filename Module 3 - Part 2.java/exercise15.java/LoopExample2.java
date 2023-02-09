import java.util.Scanner;

public class LoopExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = sc.nextInt();
        sc.close();

        int sum = 0;
        for (int i = 1; i <= terms; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + terms + " numbers = " + sum);
    }
}
