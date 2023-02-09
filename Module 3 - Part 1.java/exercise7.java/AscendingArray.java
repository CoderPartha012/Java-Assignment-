import java.util.Scanner;

public class AscendingArray {
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
        System.out.println("Enter the elements: ");

        // Read the elements of the array entered by the user
        for (int i = 0; i < size; i++) {
            numbers[i] = scan.nextInt();
        }

        // Prompt the user to enter the choice for ascending or descending order
        System.out.println("Enter the number to perform function");
        System.out.println("1--> ascending");
        System.out.println("2--> descending");

        // Read the choice entered by the user
        int choice = scan.nextInt();

        // Close the Scanner object
        scan.close();

        // Sort the array in ascending or descending order based on the choice
        if (choice == 1) {
            // Sort the array in ascending order
            for (int i = 0; i < size - 1; i++) {
                for (int j = 0; j < size - i - 1; j++) {
                    if (numbers[j] > numbers[j + 1]) {
                        int temp = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = temp;
                    }
                }
            }

            // Print the sorted array in ascending order
            System.out.println("Ascending order is:");
            for (int i = 0; i < size; i++) {
                System.out.println(numbers[i]);
            }
        } else if (choice == 2) {
            // Sort the array in descending order
            for (int i = 0; i < size - 1; i++) {
                for (int j = 0; j < size - i - 1; j++) {
                    if (numbers[j] < numbers[j + 1]) {
                        int temp = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = temp;
                    }
                }
            }

            // Print the sorted array in descending order
            System.out.println("Descending order is:");
            for (int i = 0; i < size; i++) {
                System.out.println(numbers[i]);
            }
        } else {
            System.out.println("Invalid choice!");
        }
    }
}
