package Array_list_programs;
import java.util.*;
public class  AccessArrayList {
    public static void main(String[] args){
        ArrayList list =new ArrayList();
        list.add("syed");
        list.add(40);
        list.add("santhosh");
        list.add(79);

        System.out.println("Normal for loop");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("enhanced for loop or foreach");
        for(Object i : list){
             System.out.println(i);
        }


        System.out.println("Iterators");
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}