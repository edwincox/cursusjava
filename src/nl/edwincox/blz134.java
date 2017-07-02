package nl.edwincox;

import java.util.Arrays;
import java.util.List;

public class blz134 {

    public static void main(String... args) {

        String[] array = {"Edwin", "Richard"};

        List<String> list = Arrays.asList(array);

        System.out.println("Grote lijst: " + list.size());

        list.set(1, "test");

        array[0] = "new";

        for(String b : array) System.out.println(b + "  "); // new test

        System.out.println("grote van de list: " + list.size());
        System.out.println(list.get(1));

        list.remove(1);   // trows unsupportedoperation exception......maar waarom?
    }
}