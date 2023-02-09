class Dog {
    static String name;
    static String color;
    static String breed;
    static int age;

    public Dog(String name, String color, String breed, int age) {
        Dog.name = name;
        Dog.color = color;
        Dog.breed = breed;
        Dog.age = age;
    }
}

class Cat {
    static String name;
    static String color;
    static String breed;
    static int age;

    public Cat(String name, String color, String breed, int age) {
        Cat.name = name;
        Cat.color = color;
        Cat.breed = breed;
        Cat.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Fido", "brown", "Golden Retriever", 3);
        Cat cat = new Cat("Whiskers", "black", "Siamese", 2);

        System.out.println("Is dog an instance of Dog class: " + (dog instanceof Dog));
        System.out.println("Is cat an instance of Cat class: " + (cat instanceof Cat));
    }
}
