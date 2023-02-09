class EmpConsOver {
    String name;
    int number;

    public EmpConsOver(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void display() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee no: " + number);
    }
}

class EmpConsOverTest {
    public static void main(String[] args) {
        EmpConsOver obj1 = new EmpConsOver("Akil", 101);
        obj1.display();
        EmpConsOver obj2 = new EmpConsOver("Arun", 102);
        obj2.display();
        EmpConsOver obj3 = new EmpConsOver("Rajesh", 103);
        obj3.display();
        EmpConsOver obj4 = new EmpConsOver("Vishal", 104);
        obj4.display();
    }
}
