package Array_list_programs;
import java.util.*;
public class  ArrayListone {
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


    }
    }