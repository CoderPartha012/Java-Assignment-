import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input: R --> Red");
        System.out.println("       G --> Green");
        System.out.println("       B --> Blue");
        System.out.print("Select a letter: ");
        char input = scan.next().charAt(0);
        scan.close();

        String color;
        switch (input) {
            case 'R':
                color = "Red";
                break;
            case 'G':
                color = "Green";
                break;
            case 'B':
                color = "Blue";
                break;
            default:
                color = "Invalid input";
                break;
        }
        System.out.println("Output: Your favorite color is " + color);
    }
}
