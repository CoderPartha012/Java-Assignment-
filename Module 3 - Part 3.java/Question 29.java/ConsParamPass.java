import java.util.Scanner;

public class ConsParamPass {
    int num1, num2;

    // parameterized constructor
    public ConsParamPass(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void display() {
        System.out.println("Sum of the numbers: " + (num1 + num2));
        System.out.println("Difference of the numbers: " + (num1 - num2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        ConsParamPass obj = new ConsParamPass(num1, num2);
        obj.display();
    }
}
