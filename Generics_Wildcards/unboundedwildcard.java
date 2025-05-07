import java.util.*;
public class unboundedwildcard {
    public static void main(String[]args){
        Apple a1 = new Apple("red",100);
        Apple a2 = new Apple("blue",400);
        Apple a3 = new Apple("yello",300);

        ArrayList<Apple> appleList = new ArrayList<>();
        appleList.add(a1);
        appleList.add(a2);
        appleList.add(a3);

        display(appleList);

        Orange o1 = new Orange("orange",900);
        Orange o2 = new Orange("green",100);
        Orange o3 = new Orange("pink",1000);

        ArrayList<Orange> orangeList = new ArrayList<>();
        orangeList.add(o1);
        orangeList.add(o2);
        orangeList.add(o3);

        display(orangeList);
    }

    public static void display(List<?> fruitlist){
        System.out.println("Fruit are:"+ fruitlist);
        System.out.println("Size of Fruit is:"+ fruitlist.size());
    }

    
}


class Apple{
    String color;
    int price;

    public Apple(String color, int price){
        this.color=color;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Apple [color=" + color + ", price=" + price + "]";
    }

    
}


class Orange{
    String color;
    int price;

    public Orange(String color, int price){
        this.color=color;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Orange [color=" + color + ", price=" + price + "]";
    }

    
}