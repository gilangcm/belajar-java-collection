package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
//        List<String> strings = new LinkedList<>();


        strings.add("gils");
        strings.add("diva");

        strings.set(0, "ika");

        strings.remove(0);
        System.out.println(strings.get(0));

        for ( var value : strings    ) {
            System.out.println(value);
        }

    }
}
