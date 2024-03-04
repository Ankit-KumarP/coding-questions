package Java;
// (06/11/2023, 12:53)
import java.util.*;
import java.lang.*;
public class Q002Set {
    public static void main(String[] args) {
      Queue <Integer> q1 = new ArrayDeque<>();
      Queue <Integer> pq = new PriorityQueue<>();
      q1.add(34);q1.add(2);q1.add(56);
      pq.add(34); pq.add(2);pq.add(56);
      while(!q1.isEmpty()) System.out.print(q1.poll() + " ");
      System.out.println();
      while(!pq.isEmpty()) System.out.print(pq.poll() + " ");
      System.out.println();
    }
}
