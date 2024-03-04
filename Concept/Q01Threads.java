// (18/10/2023), 11:29
package Concept;

import java.util.*;
import java.lang.*;

// class A
class A extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread-A");
                sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("e");
        }

    }
}

public class Q01Threads {
    public static void main(String[] args) {
        A thread1 = new A();
        thread1.start();
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Main-Methode");
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }
}