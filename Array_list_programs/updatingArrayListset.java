import java.util.*;
public class  updatingArrayListset {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbver of element in the arraylist");
        int n=sc.nextInt();
        ArrayList a = new ArrayList();


        for(int i=1;i<=n;i++){
            System.out.println("enter the vaule "+i);
            String str = sc.nextLine();
            a.add(str);
        }

        System.out.println("SIZE of the array is "+ a.size());

        System.out.println("Elements:");
        for(Object i : a){
            System.out.println(i);
        }

        
        

        System.out.println("enter the index value to of the element to be replaced in the array");
        int setindex=sc.nextInt();
        System.out.println("enter the value for that");
        String setvalue=sc.next();

        a.set(setindex,setvalue);
         

        System.out.println("Elements of the replaced list");
        for(Object i : a){
            System.out.println(i);
        }

    }
    }