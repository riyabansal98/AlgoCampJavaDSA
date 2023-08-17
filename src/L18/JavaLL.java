package L18;

import java.sql.SQLOutput;
import java.util.LinkedList;

public class JavaLL {

    public static void main(String[] args) {

        LinkedList<String> animals = new LinkedList<>();

        animals.add("dog");     //addAtLast
        animals.add("horse");
        animals.add("zebra");

        System.out.println(animals);

        animals.add(1, "cat");

        System.out.println(animals);

        System.out.println(animals.get(2));
        System.out.println(animals.get(0));

        //replacement
        animals.set(2, "lion");

        System.out.println(animals);

        animals.remove(1);
        System.out.println(animals);

        for(String animal : animals) {
            System.out.println(animal);
        }


    }
}
