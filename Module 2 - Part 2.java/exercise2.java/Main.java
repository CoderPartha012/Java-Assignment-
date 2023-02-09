import java.util.Scanner;

class Calculator {
    int a;
    int b;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        int a = sc.nextInt();

        System.out.print("Enter value for b: ");
        int b = sc.nextInt();

        Calculator calc = new Calculator();
        calc.a = a;
        calc.b = b;

        int addition = calc.a + calc.b;
        int subtraction = calc.a - calc.b;
        int multiplication = calc.a * calc.b;
        double division = (double) calc.a / calc.b;

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);

        sc.close();
    }
}
