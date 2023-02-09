import java.util.Scanner;

public class PassArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        // Accepting array elements
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number: ");
            arr[i] = input.nextInt();
        }

        // Calling the display method
        display(arr);
    }

    public static void display(int[] arr) {
        System.out.println("array elements from method..");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("a[" + i + "]=" + (arr[i] + 1));
        }
    }
}
