package ARRAY_DEQUE;

import java.util.*;
public class Arraydequeone{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of inital customers in the arraydeque");
        int n = sc.nextInt();

        ArrayDeque<Integer> d=new ArrayDeque<>();

        System.out.println("enter the number with space between each customer id");
        for(int i=1;i<=n;i++){
            int cusID=sc.nextInt();
            d.add(cusID);
        }
        System.out.println(" customer queue before alteration");
        for(Object o : d){
            System.out.println(o);
        }
        System.out.println("enter the customer ID to add in the first of the queue");
        int fcusID=sc.nextInt();
        d.addFirst(fcusID);
        System.out.println("enter the customer ID to last in the first of the queue");
        int lcusID=sc.nextInt();
        d.addLast(lcusID);
        
        System.out.println(" customer queue after alteration");

        for(Object o : d){
            System.out.println(o);
        }

        System.out.println(" customer queue after removing");

        d.removeFirst();
        
        for(Object o : d){
            System.out.println(o);
        }
        sc.close();
    }
    
}
