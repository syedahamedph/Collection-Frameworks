package PriorityQueue;

import java.util.*;

public class PriorityQueueOne {
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

        int done = pq.poll();
        System.out.println("the first priority has been finished " + done);

        System.out.println("enter the new high priority element");
        int newelement = sc.nextInt();
        pq.add(newelement);

        ArrayList list = new ArrayList<>();
        list.addAll(pq);

        Collections.sort(list);

        System.out.println("Updated Queue is");
        for (Object o : list) {
            System.out.print(o + " ");
        }

    }

}
