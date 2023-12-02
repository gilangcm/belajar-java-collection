package programmer.zaman.now.collection;

import programmer.zaman.now.collection.data.Person;
import programmer.zaman.now.collection.data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {

        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed()); // kalo mau descending tinggal pake reversed

        people.add(new Person("gils"));
        people.add(new Person("diva"));
        people.add(new Person("udin"));

        for ( var person:people      ) {
            System.out.println(person.getName());
        }

        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
//        sortedSet.add(new Person("budi")); // ERROR karena sudah immutable
    }
}
