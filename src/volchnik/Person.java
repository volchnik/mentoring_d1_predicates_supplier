package volchnik;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Person {
  private Integer age;
  private String name;

  public Person(Integer age, String name) {
    this.age = age;
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static List<Person> generatePersons(Supplier<Person> personSupplier, int count) {
    return IntStream.range(0, count).mapToObj(i -> personSupplier.get()).collect(Collectors.toList());
  }

  public static void outputAdultPersons(List<Person> personList, Predicate<Person> agePredicate) {
    personList.stream().filter(agePredicate).forEach(System.out::println);
  }

  @Override
  public String toString() {
    return "Person{" +
            "age=" + age +
            ", name='" + name + '\'' +
            '}';
  }
}
