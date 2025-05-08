package PriorityQueue;

import java.util.*;

import java.util.PriorityQueue;

public class PQSortingone {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(9);
        pq.add(3);
        pq.add(6);
        pq.add(3);
        pq.add(7);
        pq.add(2);
        pq.add(1);

        // way 1
        PriorityQueue<Integer> pqSorted = new PriorityQueue<>();
        System.out.println(pq.size());
        for (int i = 1; i <= 7; i++) {
            int n = pq.peek();
            pqSorted.add(n);
            pq.remove();
        }
        for (Object g : pqSorted) {
            System.out.println(g);
        }

        // way 2

    }

}
