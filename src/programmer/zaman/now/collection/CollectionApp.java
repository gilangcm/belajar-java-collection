package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        collection.add("gils");
        collection.add("diva");
        collection.add("dinda");
        collection.addAll(List.of("Gilang", "chandra" ,"maulana"));

        for ( var value : collection    ) {
            System.out.println(value);
        }

        System.out.println("REMOVE");

        collection.remove("gils");

        collection.removeAll(List.of("Gilang","chandra"));

        for ( var value : collection    ) {
            System.out.println(value);
        }

        System.out.println(
                collection.contains("diva")

        );

        System.out.println(
                collection.containsAll(List.of("dinda","maulana"))
        );

        System.out.println(collection.size());
    }
}
