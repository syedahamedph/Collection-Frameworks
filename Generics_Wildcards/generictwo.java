package Generics_Wildcards;
import java.util.*;
public class generictwo {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element in the linked list");
        int n = sc.nextInt();
        System.out.println("enter the type of the Arraylist");
        String type=sc.next();

        if(type.equals("Integer")){
            ArrayList<Integer> list = new ArrayList<>();
            System.out.println("enter the value");
            for(int i=1;i<=n;i++){
            
                int v=sc.nextInt();
                list.add(v);
            }
            
            System.out.println("elements of the linked list are:");

            for(Object o : list){
                System.out.println(o);
            }
        }
        else if(type.equals("Double"))
        {

            ArrayList<Double> list = new ArrayList<>();
            System.out.println("enter the value");
            for(int i=1;i<=n;i++){
            
                double v=sc.nextDouble();
                list.add(v);
            }
            
            System.out.println("elements of the linked list are:");

            for(Object o : list){
                System.out.println(o);
            }
        }
        else if(type.equals("String")){
            
            ArrayList<String> list = new ArrayList<>();
            System.out.println("enter the value");
            for(int i=1;i<=n;i++){
            
                String v=sc.next();
                list.add(v);
            }
            
            System.out.println("elements of the linked list are:");

            for(Object o : list){
                System.out.println(o);
            }
        }
        sc.close();
    }
}
