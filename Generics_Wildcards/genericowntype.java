import java.util.*;
public class genericowntype {
   public static void main(String[] args){
        dog d1 = new dog("Bruno","pug");
        dog d2 = new dog("Scooby","dobar man");
        dog d3 = new dog("pluto","great dane");

        ArrayList<dog> list = new ArrayList<>();
        list.add(d1);
        list.add(d2);
        list.add(d3);

        System.out.println(list);
   }   
}


class dog{
    String name;
    String breed;
    public dog(String name,String breed){
         this.name=name;
         this.breed=breed;
    }
    @Override
    public String toString() {
        return "dog [name=" + name + ", breed=" + breed + "]";
    }
    
}