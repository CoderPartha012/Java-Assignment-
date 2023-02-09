import java.util.Scanner;

public class FibonacciExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = sc.nextInt();

        int first = 0, second = 1, next;
        System.out.println(first);
        System.out.println(second);

        for (int i = 2; i < n; i++) {
            next = first + second;
            System.out.println(next);
            first = second;
            second = next;
        }
    }
}
