// (11/01/2024, 22:43)
package Concept;

class Basic {
    int id;

    Basic(int id) {
        this.id = id;
    }
}

abstract class Basic2 {
    int id;

    public abstract void setDetails(int id);

    void printDetails() {
        System.out.println(this.id);
    }
}

class Basic2_child extends Basic2 {

    public void setDetails(int id) {
        this.id = id;
    }
}

interface intro {
    int id = 9;

    void fillDetails();

    void printDetails();
}

class introChild implements intro {

    public void fillDetails() {
        System.out.println(this.id);
    }

    public void printDetails() {
        System.out.println("PRINT DETAILS");
    }
}

public class Q04OOPS {
    public static void main(String args[]) {
        // Basic b1 = new Basic(12);
        // Basic2_child bc1 = new Basic2_child();
        // bc1.setDetails(37);
        // bc1.printDetails();

        introChild ic = new introChild();
        ic.printDetails();
        ic.fillDetails();
        ic.printDetails();
    }
}