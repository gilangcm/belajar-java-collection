package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {


        NavigableMap<String, String> map = new TreeMap<>();

        map.put("gils","gils");
        map.put("diva", "diva");
        map.put("udin", "udin");

        for (var key : map.keySet()    ) {
            System.out.println(key);
        }

        System.out.println(map.lowerKey("gils"));
        System.out.println(map.higherKey("gils"));

        NavigableMap<String, String> mapDesc = map.descendingMap();

        for (var key : mapDesc.keySet()    ) {
            System.out.println(key);
        }

        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(map);

//        immutable.put("ika", "ika"); // ERROR
    }
}
