import java.util.Scanner;

public class CountOdd {
    public static void main(String[] args) {
        // Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the array size: ");

        // Read the size of the array entered by the user
        int size = scan.nextInt();

        // Declare an array of integers with the given size
        int[] numbers = new int[size];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array: ");

        // Read the elements of the array entered by the user
        for (int i = 0; i < size; i++) {
            numbers[i] = scan.nextInt();
        }

        // Close the Scanner object
        scan.close();

        // Variables to store the count of even and odd numbers
        int evenCount = 0;
        int oddCount = 0;

        // Loop through the array and count the even and odd numbers
        for (int i = 0; i < size; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Print the results
        System.out.println("No of even numbers is: " + evenCount);
        System.out.println("No of odd numbers is: " + oddCount);
    }
}
