package programmer.zaman.now.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {

//        Set<String> names = new HashSet<>();
        Set<String> names = new LinkedHashSet<>();
        names.add("gils");
        names.add("diva");
        names.add("dinda");
        names.add("diva");
        names.add("dinda");

        for ( var name : names        ) {
            System.out.println(name);
        }
    }
}
