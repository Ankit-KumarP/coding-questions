// (29/08/23), 18:05
package Java;
import java.util.*;
public class Q001BitSet {
    public static void main(String[] args) {
        BitSet b1 = new BitSet();
        BitSet b2 = new BitSet(5);
        b1.set(0); 
        b1.set(2);
        b1.set(4);
        b1.set(6);
         b1.set(7);

        System.out.println("b1 : " +b1);
        System.out.println("b1 size : " +b1.size());
        
    }
}
