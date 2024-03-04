// (15/11/2023, 8:31AM)
package Java;

import java.util.*;
import java.lang.*;

// Student class
class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}

// sortbyRoll
class sortbyRoll implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s2.rollNo - s1.rollNo;
    }
}

public class Q005Comparator {
    public static void main(String args[]) {
        Student s1 = new Student(1, "Ankit Kumar");
        Student s2 = new Student(32, "Jatin");
        Student s3 = new Student(2, "Bhupender Jogi");
        Student s4 = new Student(10, "Kamlesh");
        Student[] arr = new Student[4];
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        arr[3] = s4;
        Arrays.sort(arr, new sortbyRoll());
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].rollNo + " " + arr[i].name);
        }
    }
}
