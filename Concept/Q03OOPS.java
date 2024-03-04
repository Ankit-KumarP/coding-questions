// (11/01/2024, 21:51)
// polymorphism | Inheritence
package Concept;

// parent class
class Student {
    String name;
    static int unique_number;
    int serial_number;

    Student(String name) {
        this.name = name;
        System.out.println("PARENT CONSTRUCTOR");
    }

    Student(Student s1){
        this.name = s1.name.toUpperCase();
        this.unique_number = s1.unique_number + 2;
        this.serial_number = s1.unique_number + 2;
    }
    public void fillDetails(int unique_number, int serial_number) {
        this.unique_number = unique_number;
        this.serial_number = serial_number;
    }

    public void printDetails(String name) {
        this.name = name;
    }

    public void printDetails() {
        // System.out.println(this.name + " => " + this.unique_number + " => " + this.serial_number);
        System.out.println(this.name);
    }

    public void parent() {
        System.out.println("Parent");
    }
}

// child class
class Child extends Student {
    String name;

    Child(String name) {
        super("Ankit Kumar");
        this.name = name;
        System.out.println("CHILD CONSTRUCTOR");
    }

    // public void printDetails() {
    //     super.printDetails();
    //     System.out.println(this.name);
    //     ;
    // }
}

public class Q03OOPS {
    public static void main(String args[]) {
        Student s1 = new Student("Ankit Kumar");
        // s1.printDetails();
        // s1.printDetails("Pragyan Prusty");
        // s1.printDetails();

        Child c1 = new Child("Pragyan Prusty");
        c1.printDetails();
        // s1.parent();

        // Student s1 = new Student("Ankit Kumar");
        // Student s2 = new Student(s1);
        // s1.printDetails();
        // s2.printDetails();

    }
}
