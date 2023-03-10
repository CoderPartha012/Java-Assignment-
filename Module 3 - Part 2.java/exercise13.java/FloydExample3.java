import java.util.Scanner;

public class FloydExample3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows in the Floyd's triangle: ");
        int rows = sc.nextInt();
        sc.close();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((j % 2 == 1) ? "0" : "1");
            }
            System.out.println();
        }
    }
}
