package programmer.zaman.now.collection;

import java.util.*;

public class SortingApp {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.addAll(List.of("gils","diva","udin","oves","farah"));

        Collections.sort(list);

        for ( var value : list         ) {
            System.out.println(value);
        }

        Comparator<String> reverse = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
            
        };

        Collections.sort(list, reverse);

        System.out.println("");
        System.out.println("REVERSE");
        System.out.println("");
        for ( var value : list    ) {
            System.out.println(value);
        }

    }
}
