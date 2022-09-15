package kata1;

import java.time.LocalDate;

public class Kata1 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2000, 11, 21);
        Person person = new Person("Alejandro", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
    }
}