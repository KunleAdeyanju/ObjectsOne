package object1;

import java.util.Arrays;
import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {


        Person person3 = new Person("judy",30,172);
        System.out.println(person3.height);

        Person[] people = new Person[10];
        Person person1 = new Person("Alice", 25,134);
        Person person2 = new Person("Bob", 30,778);

        people[0] = person1;
        people[1] = person2;

        System.out.println(Arrays.toString(people));

        }
}
