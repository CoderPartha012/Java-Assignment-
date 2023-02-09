import java.util.Scanner;

// Class definition
class CallByValue {

    // Method definition to swap values using call by value
    static void swap(int x, int y) {
        // Temporary variable to store the value of x
        int temp = x;
        // Assigning the value of y to x
        x = y;
        // Assigning the value of temp (previous value of x) to y
        y = temp;
        // Printing the values of x and y after swapping
        System.out.println("From method x = " + x + " y = " + y);
    }

    // Main method
    public static void main(String args[]) {
        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
        // Prompting the user to enter two numbers
        System.out.print("Enter two numbers: ");
        // Reading the first number
        int x = sc.nextInt();
        // Reading the second number
        int y = sc.nextInt();
        // Printing the values of x and y before swapping
        System.out.println("Before calling method x = " + x + " y = " + y);
        // Calling the swap method with arguments x and y
        swap(x, y);
        // Printing the values of x and y after calling the swap method
        System.out.println("After calling method x = " + x + " y = " + y);
    }
}
