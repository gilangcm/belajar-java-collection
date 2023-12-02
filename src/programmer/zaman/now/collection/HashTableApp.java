package programmer.zaman.now.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {

        Map<String, String> map = new Hashtable<>();

        map.put("gils","gils value");
        map.put("diva","diva");
        map.put("udin","udin");

        for ( var key : map.keySet()   ) {
            System.out.println(key);
        }

    }
}
