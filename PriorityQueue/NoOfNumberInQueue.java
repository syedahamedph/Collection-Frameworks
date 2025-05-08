package PriorityQueue;

import java.util.*;

public class NoOfNumberInQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element in the queue");
        int n = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        System.out.println("enter the values one by one");

        for (int i = 1; i <= n; i++) {
            int e = sc.nextInt();
            pq.add(e);

        }

        System.out.println("enter the new high priority element");
        int newelement = sc.nextInt();
        pq.add(newelement);

        System.out.println("The NUmber of element in the queue is " + pq.size());
    }

}
