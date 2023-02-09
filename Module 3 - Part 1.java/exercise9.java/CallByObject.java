import java.util.Scanner;

public class CallByObject {
    int a, b;

    public void swap(CallByObject obj) {
        int temp = obj.a;
        obj.a = obj.b;
        obj.b = temp;
    }

    public static void main(String[] args) {
        CallByObject obj = new CallByObject();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values of a and b:");
        obj.a = sc.nextInt();
        obj.b = sc.nextInt();

        obj.swap(obj);

        System.out.println("After swapping a = " + obj.a);
        System.out.println("After swapping b = " + obj.b);
    }
}
