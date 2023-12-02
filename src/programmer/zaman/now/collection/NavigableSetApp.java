package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {

        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("gils","diva","udin","iki","farah","oves"));

        NavigableSet<String> nameReverse = names.descendingSet();
        NavigableSet<String> farah = names.tailSet("farah", true);

        for ( var name:farah       ) {
            System.out.println(name);
        }

        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
//        immutable.add("hai");
    }
}
