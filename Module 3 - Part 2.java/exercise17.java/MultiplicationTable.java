import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.println(i + "*" + n + "=" + result);
        }
    }
}
