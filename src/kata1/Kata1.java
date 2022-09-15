package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Marta", new Date(99, 7, 6));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
    }
}