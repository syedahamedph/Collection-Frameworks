package Linked_list_programs;
import java.util.*;
public class linkedlistget {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element in the linked list");
        int n = sc.nextInt();
        LinkedList list = new LinkedList();
        System.out.println("enter the value");
        for(int i=1;i<=n;i++){
           
            String v=sc.next();
            list.addLast(v);
        }


        System.out.println("the first element of the linked list is " +list.getFirst());
        System.out.println("the last element of the linked list is " +list.getLast());
        System.out.println("the  size of the linked list is " +list.size());


        System.out.println("elements of the linked list are:");

        for(Object o : list){
            System.out.println(o);
        }
    }
}
