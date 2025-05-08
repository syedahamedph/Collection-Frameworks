package Generics_Wildcards;

import java.util.*;

public class lowerboundwildcard {
    public static void main(String[] args) {
        Apple a1 = new Apple("red", 100);
        Apple a2 = new Apple("blue", 400);
        Apple a3 = new Apple("yello", 300);

        ArrayList<Apple> appleList = new ArrayList<>();
        appleList.add(a1);
        appleList.add(a2);
        appleList.add(a3);

        // display(appleList); error because <? super fruit> this will only allow the
        // parent classes

        Orange o1 = new Orange("orange", 900);
        Orange o2 = new Orange("green", 100);
        Orange o3 = new Orange("pink", 1000);

        ArrayList<Orange> orangeList = new ArrayList<>();
        orangeList.add(o1);
        orangeList.add(o2);
        orangeList.add(o3);

        // display(orangeList);

        fruit f1 = new fruit("fruit", 900);
        fruit f2 = new fruit("green", 100);
        fruit f3 = new fruit("pink", 1000);

        ArrayList<fruit> fruitList = new ArrayList<>();
        fruitList.add(f1);
        fruitList.add(f2);
        fruitList.add(f3);

        display(fruitList);
    }

    public static void display(List<? super fruit> fruitlist) {
        System.out.println("Fruit are:" + fruitlist);
        System.out.println("Size of Fruit is:" + fruitlist.size());
    }

}

class fruit {
    String color;
    int price;

    public fruit(String color, int price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "fruit [color=" + color + ", price=" + price + "]";
    }

}

class Apple extends fruit {
    String color;
    int price;

    public Apple(String color, int price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apple [color=" + color + ", price=" + price + "]";
    }

}

class Orange extends fruit {
    String color;
    int price;

    public Orange(String color, int price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Orange [color=" + color + ", price=" + price + "]";
    }

}
