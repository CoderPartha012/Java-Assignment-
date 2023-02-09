import java.util.Scanner;

public class CountArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int positiveCount = 0;
        int negativeCount = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] > 0) {
                positiveCount++;
            } else if (arr[i] < 0) {
                negativeCount++;
            }
        }

        System.out.println("Positive count: " + positiveCount);
        System.out.println("Negative count: " + negativeCount);
    }
}
