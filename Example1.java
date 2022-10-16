package JavaNewFeatures;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("Vikram");
        list.add("Vikrant");
        list.add("Ramesh");
        list.add("Suresh");

        list.forEach(System.out::println);

    }
}
