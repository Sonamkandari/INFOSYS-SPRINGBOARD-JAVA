class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing something...");
    }

    public void printColor() {
        System.out.println("Pen color: " + this.color);
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Student name: " + this.name);
        System.out.println("Student age: " + this.age);
    }
}

public class oops1 {
    public static void main(String[] args) {
        Pen myObj1 = new Pen();
        myObj1.color = "Red";
        myObj1.type = "Gel";

        System.out.println("Pen 1 color: " + myObj1.color);
        System.out.println("Pen 1 type: " + myObj1.type);
        myObj1.write();

        Pen myObj2 = new Pen();
        myObj2.color = "Black";
        myObj2.type = "BallPoint";
        myObj2.printColor();

        System.out.println("-----------------------------");

        Student s1 = new Student("Sonam", 7);
        s1.printInfo();
    }
}
