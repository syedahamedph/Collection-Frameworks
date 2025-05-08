package TreeSet;

import java.util.*;

public class TreeSetBasic {
    public static void main(String[] args) {

        TreeSet set = new TreeSet<>();
        set.add(44);
        set.add(11);
        set.add(44);
        set.add(44);
        set.add(92);
        set.add(44);
        set.add(64);

        System.out.println(set);
        System.out.println(set.first());
        System.out.println(set.last());
    }

}
