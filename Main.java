import java.util.*;

class Main {
    public static void main(String[] args) {

        ArrayList<Person> family = new ArrayList<Person>();

        family.add(new GrandParent("Mary"));
        family.add(new GrandParent("John"));
        family.add(new Parent("Amy", "medium"));
        family.add(new Parent("Andy", "low"));
        family.add(new Child("Annie", "high", "Johnson"));

        for (Person person : family) {
            person.walk();
        }
    }
}