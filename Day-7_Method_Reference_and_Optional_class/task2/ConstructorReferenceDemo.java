import java.util.*;
import java.util.stream.*;
import java.util.function.BiFunction;

class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // toString for printing
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class ConstructorReferenceDemo {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Shreyas", "Aarav", "Priya", "Neha");
        List<Integer> ages = Arrays.asList(21, 24, 22, 23);

        BiFunction<String, Integer, Person> personCreator = Person::new;

        List<Person> people = IntStream.range(0, names.size())
                .mapToObj(i -> personCreator.apply(names.get(i), ages.get(i)))
                .collect(Collectors.toList());

        people.forEach(System.out::println);
    }
}
