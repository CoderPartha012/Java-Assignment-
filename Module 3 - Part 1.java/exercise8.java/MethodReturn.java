public class MethodReturn {

    public double displaySalary(double salary, double hra) {
        double vishalSalary = salary + hra;
        return vishalSalary;
    }

    public static void main(String[] args) {
        MethodReturn obj = new MethodReturn();
        double result = obj.displaySalary(20000, 2000);
        System.out.println("Vishal salary is " + result + ".");
    }
}
