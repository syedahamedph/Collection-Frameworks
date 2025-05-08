package Array_list_programs;
import java.util.*;
public class  updatingArrayListadd {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbver of element in the arraylist");
        int n=sc.nextInt();
        ArrayList a = new ArrayList();


        for(int i=1;i<=n;i++){
            System.out.println("enter the vaule "+i);
            int num = sc.nextInt();
            a.add(num);
        }

        System.out.println("SIZE of the array is "+ a.size());

        System.out.println("Elements:");
        for(Object i : a){
            System.out.println(i);
        }

        System.out.println("enter the index value to of the new element to be added in the array");
        int addindex=sc.nextInt();
        System.out.println("enter the value for that");
        int addvalue=sc.nextInt();

        a.add(addindex,addvalue);
         

        System.out.println("Elements of the added list");
        for(Object i : a){
            System.out.println(i);
        }
        

        

    }
    }