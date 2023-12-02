package programmer.zaman.now.collection;

import programmer.zaman.now.collection.data.Person;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {

        Person person = new Person("gils");

        person.addHobby("game");
        person.addHobby("masak");
         doSomethingWithHobbies(person.getHobbies());
        for (var hobby : person.getHobbies()  ) {
            System.out.println(hobby);
        }

    }

    public static void doSomethingWithHobbies (List<String> hobbies){
        hobbies.add("eaaa");
    }
}
