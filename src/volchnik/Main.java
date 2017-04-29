package volchnik;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static final List<String> nameList = Arrays.asList(new String[] {
            "John", "Jack", "Tom", "Mike", "Bob"
    });
    public static void main(String[] args) {
        Random random = new Random();
        List<Person> personList = Person.generatePersons(() ->
                new Person(random.nextInt(90) + 1, nameList.get(random.nextInt(nameList.size()))), 10);

        Person.outputAdultPersons(personList, p -> p.getAge() >= 30);
    }
}
