import java.util.*;
public class  ArrayListtwo {
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


        System.out.println("enter the value of the index to get the element");
        int e = sc.nextInt();
        System.out.println("element at the index " + e + "is " + a.get(e));


    }
    }