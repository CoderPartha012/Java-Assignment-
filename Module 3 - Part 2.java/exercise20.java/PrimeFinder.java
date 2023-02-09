import java.util.Scanner;

public class PrimeFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int no = input.nextInt();

        boolean isPrime = true;
        for (int i = 2; i <= no / 2; i++) {
            if (no % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("The given no is prime");
        } else {
            System.out.println("The given no is not a prime");
        }
    }
}
