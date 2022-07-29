import model.Dog;
import model.Person;

import java.time.LocalDate;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World, you know what's up");

        Person will = new Person("Ashley", "Christensen", LocalDate.of(1988, 6, 15));
        Person ashley = new Person("Will", "Odam", LocalDate.of(1973, 11, 12));

        will.setSpouse(ashley);

        Dog bimbo = new Dog("Bimbo", LocalDate.of(2019, 3, 3));
        will.setPet(bimbo);

        System.out.println(will);
    }
}
