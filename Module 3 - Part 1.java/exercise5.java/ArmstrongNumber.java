import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Input: ");

        // Read the number entered by the user
        int num = scan.nextInt();

        // Close the Scanner object
        scan.close();

        // Store the original value of the number
        int originalNum = num;

        // Variable to store the result of the calculation
        int result = 0;

        // Variable to store the number of digits in the number
        int digits = 0;

        // Find the number of digits in the number
        while (originalNum != 0) {
            originalNum /= 10;
            ++digits;
        }

        // Reset the original value of the number
        originalNum = num;

        // Calculate the result
        while (originalNum != 0) {
            int remainder = originalNum % 10;
            result += Math.pow(remainder, digits);
            originalNum /= 10;
        }

        // Check if the number is an Armstrong number
        if (result == num) {
            System.out.println("Output: It is an Armstrong number");
        } else {
            System.out.println("Output: It is not an Armstrong number");
        }
    }
}
