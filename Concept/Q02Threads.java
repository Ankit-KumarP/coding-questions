// (19/20/2023), 15:09
package Concept;

import java.util.*;
import java.lang.*;

// creating threads
class TH implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread");
        }

    }
}

public class Q02Threads {
    public static void main(String[] args) {
        TH thread1 = new TH();
        Thread t1 = new Thread(thread1);
        t1.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main");
        }
    }
}
