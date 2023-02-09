public class TypeCasting {
    public static void main(String[] args) {
        byte b = 10;
        int i = b;
        float f = i;
        long l = (long) f;

        System.out.println("Byte value: " + b);
        System.out.println("Int value: " + i);
        System.out.println("Float value: " + f);
        System.out.println("Long value: " + l);
    }
}
