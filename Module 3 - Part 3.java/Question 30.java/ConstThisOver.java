import java.util.Scanner;

public class ConstThisOver {
    int empNum;

    // parameterized constructor
    public ConstThisOver(int empNum) {
        this.empNum = empNum;
    }

    // default constructor
    public ConstThisOver() {
        this(0); // calling the parameterized constructor
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the employee number: ");
        int empNum = sc.nextInt();
        ConstThisOver obj = new ConstThisOver(empNum);
        System.out.println("Employee number: " + obj.empNum);
    }
}
