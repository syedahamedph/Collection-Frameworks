import java.util.*;
public class upperboundwildcard {
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


        potato p1 = new potato("potato",900);
        potato p2 = new potato("green",100);
        potato p3 = new potato("pink",1000);

        ArrayList<potato> potatoList = new ArrayList<>();
        potatoList.add(p1);
        potatoList.add(p2);
        potatoList.add(p3);

        //display(potatoList);   -   this will show error because  in display <? extends fruit> this accept only the class that extends the fruit
        System.out.println(potatoList);
    }

    public static void display(List<? extends fruit> fruitlist){
        System.out.println("Fruit are:"+ fruitlist);
        System.out.println("Size of Fruit is:"+ fruitlist.size());
    }

    
}


class fruit{

}


class Apple extends fruit{
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


class Orange extends fruit{
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


class potato{
    String color;
    int price;

    public potato(String color, int price){
        this.color=color;
        this.price=price;
    }

    @Override
    public String toString() {
        return "potato [color=" + color + ", price=" + price + "]";
    }
}