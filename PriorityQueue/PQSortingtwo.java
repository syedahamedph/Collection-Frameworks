package PriorityQueue;

import java.util.*;

import java.util.PriorityQueue;

public class PQSortingtwo {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(9);
        pq.add(3);
        pq.add(6);
        pq.add(3);
        pq.add(7);
        pq.add(2);
        pq.add(1);

        int n = pq.size();

        for (int i = 1; i <= n; i++) {
            System.out.println(pq.poll());
        }

    }

}
