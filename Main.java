abstract class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract void displayDetails();
}

class Student extends Person {
    double grade;

    Student(String name, int id, double grade) {
        super(name, id);
        this.grade = grade;
    }

    boolean isPass() {
        return grade >= 60;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Grade: " + grade);
        System.out.println("Pass: " + (isPass() ? "Yes" : "No"));
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ali", 101, 75.5);
        Student s2 = new Student("Sara", 102, 45.0);

        s1.displayDetails();
        System.out.println("--------------------");
        s2.displayDetails();
    }
}
