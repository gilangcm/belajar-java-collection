package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {

        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("jill");

        Set<String> mutable = new HashSet<>();
        mutable.add("gilang");
        mutable.add("diva");
        mutable.add("dinda");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("gils", "dinda" );

//        set.remove("gils"); // ERROR
//        set.add("fitra"); // ERROR

    }
}
