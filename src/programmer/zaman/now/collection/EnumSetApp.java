package programmer.zaman.now.collection;

import java.util.EnumSet;

public class EnumSetApp {

    public static enum Gender {
        MALE , FEMALE , NOT_MENTION
    }

    public static void main(String[] args) {

//        EnumSet<Gender> genders = EnumSet.allOf(Gender.class); // kalo mau semua
        EnumSet<Gender> genders = EnumSet.of(Gender.MALE, Gender.FEMALE); // kalo mau satu2

        for ( var gender:genders       ) {
            System.out.println(gender);
        }

//        Gender[] values = Gender.values(); // bisa juga sperti ini

    }
}
